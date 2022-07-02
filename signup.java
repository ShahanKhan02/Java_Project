// Each program has back button to return to the admin panel.

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;

// This class is written for the main page(Login).
public class signup implements ActionListener {

    JFrame f = new JFrame("Sign In");
    JLabel username = new JLabel("Username: ");
    JLabel password = new JLabel("Password: ");

    JTextField usr = new JTextField();
    JPasswordField pass = new JPasswordField();

    JButton login = new JButton("LOG IN");
    JButton quit = new JButton("QUIT");

    Font a1 = new Font("Poppins", Font.PLAIN, 14);
    Font a2 = new Font("Poppins", Font.BOLD, 24);
    Font a3 = new Font("Poppins", Font.PLAIN, 13);

    JLabel title = new JLabel("Welcome!");
    JLabel txt = new JLabel("Enter your login credentials");

    JCheckBox showpass = new JCheckBox("Show Password");

    // ImageIcon im = new ImageIcon("F:\\Abdul Basit
    // Khan\\JAVA\\_Files\\GUI\\Projects\\Project\\resources\\bg.jpg");
    // JLabel bg = new JLabel("",im,JLabel.CENTER);

    signup() {

        gui();
        setComps();
        addComps();
        addAction();
    }

    public void gui() {

        f.setSize(500, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void setComps() {

        // bg.setBounds(0,0,500,350);

        title.setBounds(175, 10, 180, 50);
        title.setFont(a2);

        txt.setBounds(150, 40, 180, 50);
        txt.setFont(a3);
        txt.setForeground(Color.GRAY);

        username.setBounds(150, 85, 180, 50);
        username.setFont(a1);

        usr.setBounds(150, 120, 180, 30);
        usr.setFont(a1);

        password.setBounds(150, 145, 180, 50);
        password.setFont(a1);

        pass.setBounds(150, 180, 180, 30);
        pass.setFont(a1);

        login.setBounds(245, 240, 85, 30);
        login.setFocusPainted(false);
        login.setFont(a1);

        quit.setBounds(150, 240, 88, 30);
        quit.setFocusPainted(false);
        quit.setFont(a1);

        showpass.setBounds(150, 210, 150, 30);
        showpass.setFont(a1);

    }

    public void addComps() {

        // f.add(bg);

        f.add(title);
        f.add(txt);

        f.add(username);
        f.add(password);

        f.add(usr);
        f.add(pass);

        f.add(login);
        f.add(quit);

        f.add(showpass);

    }

    public void addAction() {

        login.addActionListener(this);
        quit.addActionListener(this);
        showpass.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == login) {
            String u = usr.getText();
            String p = new String(pass.getPassword());
            if (u.equals("Shahan") && p.equals("880099")) {
                new Programs();
                f.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(f, "Incorrect username or password.", "Messege",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            try {
                // Writing data into text file.
                FileWriter writ = new FileWriter("SignUp.txt", true);
                BufferedWriter bWriter = new BufferedWriter(writ);

                bWriter.newLine();
                bWriter.newLine();
                bWriter.write("Username: " + usr.getText());
                bWriter.newLine();
                bWriter.write("Password: " + pass.getText());
                bWriter.close();
                bWriter.close();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == showpass) {
            if (showpass.isSelected()) {
                pass.setEchoChar((char) 0); // password = JPasswordField
            } else {
                pass.setEchoChar('*');
            }

        }

        if (e.getSource() == quit) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        new signup();
    }
}