
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class EvenOdd implements ActionListener {

    JFrame frame = new JFrame("Even Odd Numbers");
    JButton button = new JButton("Check");
    JButton back = new JButton("< Menu");
    JTextField tf = new JTextField();
    JLabel labl = new JLabel("Enter a number: ");
    JLabel title = new JLabel("*Even Odd*");
    JLabel labl1 = new JLabel();
    Font t = new Font("Tahoma", Font.BOLD, 14);

    int val;

    EvenOdd() {
        gui();
        addComponents();
        settingComponents();
        addActions();
    }

    public void gui() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void addComponents() {
        frame.add(button);
        frame.add(tf);
        frame.add(labl);
        frame.add(labl1);
        frame.add(back);
        frame.add(title);
    }

    public void settingComponents() {
        button.setBounds(50, 150, 70, 50);
        labl.setBounds(20, 50, 150, 30);
        labl1.setBounds(20, 160, 180, 30);
        labl1.setFont(t);
        labl1.setHorizontalAlignment(SwingConstants.CENTER);
        button.setBounds(120, 120, 80, 30);
        back.setBounds(20, 120, 80, 30);
        tf.setBounds(20, 80, 180, 30);
        title.setBounds(20, 10, 180, 30);
        title.setFont(t);
        title.setHorizontalAlignment(JLabel.CENTER);
    }

    public void addActions() {
        button.addActionListener(this);
        back.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button) {
                val = Integer.parseInt(tf.getText());
                if (val % 2 == 0) {
                    labl1.setForeground(Color.GREEN);
                    labl1.setText("EVEN");
                } else {
                    labl1.setForeground(Color.RED);
                    labl1.setText("ODD");
                }
            }
            

            FileWriter writ = new FileWriter("EvenOdd.txt", true);
            BufferedWriter bWriter = new BufferedWriter(writ);

            bWriter.newLine();
            bWriter.write("Number: " + tf.getText());
            bWriter.newLine();
            bWriter.write("Result: " + labl1.getText());
            bWriter.close();

        } catch (Exception ab) {
            JOptionPane.showMessageDialog(frame, "Please enter any integer value.", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        if (e.getSource() == back) {
            new Programs();
            frame.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new EvenOdd();
    }
}
