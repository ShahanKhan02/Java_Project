// In this program i have used 2 classes, one for login screen and the other one for containing the buttons
// for all the programs i have written.
// Each button has its own function to open the particular program.
// Each program has back button to return to the admin panel.

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;

// This class is written to arrange all the buttons on the frame.
class Programs implements ActionListener {

    JFrame frame = new JFrame("Programs");
    JLabel title = new JLabel("Admin Panel");
    JButton ac = new JButton("Age Calculator");
    JButton cf = new JButton("\u2109  to \u2103");
    JButton eo = new JButton("Even Odd");
    JButton factorial = new JButton("Factorial");
    JButton km = new JButton("Kilometer to Meter");
    JButton fm = new JButton("Feet to Meter");
    JButton pn = new JButton("Prime Numbers");
    JButton fg = new JButton("Find Grade");
    Font f1 = new Font("Poppins", Font.BOLD, 20);
    Font f2 = new Font("Segui UI", Font.BOLD, 12);
    JLabel txt = new JLabel("Developed by: Shahan Ali");
    JButton calc = new JButton("Calculator");
    JButton backLogin = new JButton("<Back to Login");

    Programs() {

        gui();
        setComponents();
        addComponents();
        addActions();

    }

    public void gui() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void setComponents() {

        // Heading
        title.setBounds(0, 10, 480, 50);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(f1);

        // Text area bottom

        txt.setBounds(20, 270, 250, 50);
        txt.setFont(new Font("Microsoft sans serif", Font.ITALIC, 12));
        txt.setForeground(Color.GRAY);

        // 1st Row
        ac.setBounds(20, 80, 140, 50);
        ac.setFocusPainted(false);
        ac.setFont(f2);

        cf.setBounds(170, 80, 140, 50);
        cf.setFocusPainted(false);
        cf.setFont(f2);

        eo.setBounds(320, 80, 140, 50);
        eo.setFocusPainted(false);
        eo.setFont(f2);

        // 2nd Row
        factorial.setBounds(20, 150, 140, 50);
        factorial.setFocusPainted(false);
        factorial.setFont(f2);

        km.setBounds(170, 150, 140, 50);
        km.setFocusPainted(false);
        km.setFont(f2);

        fm.setBounds(320, 150, 140, 50);
        fm.setFocusPainted(false);
        fm.setFont(f2);

        // 3rd Row
        pn.setBounds(20, 220, 140, 50);
        pn.setFocusPainted(false);
        pn.setFont(f2);

        fg.setBounds(170, 220, 140, 50);
        fg.setFocusPainted(false);
        fg.setFont(f2);

        calc.setBounds(320, 220, 140, 50);
        calc.setFont(f2);
        calc.setFocusPainted(false);

        backLogin.setBounds(5, 5, 120, 30);
        backLogin.setContentAreaFilled(false);
        backLogin.setBorder(null);
        backLogin.setFont(new Font("Poppins", Font.PLAIN, 14));
        backLogin.setFocusable(false);
        backLogin.setForeground(Color.BLACK);
    }

    public void addComponents() {
        frame.add(ac);
        frame.add(cf);
        frame.add(eo);
        frame.add(factorial);
        frame.add(km);
        frame.add(fm);
        frame.add(pn);
        frame.add(fg);
        frame.add(title);
        frame.add(txt);
        frame.add(calc);
        frame.add(backLogin);
    }

    public void addActions() {
        ac.addActionListener(this);
        cf.addActionListener(this);
        eo.addActionListener(this);
        factorial.addActionListener(this);
        km.addActionListener(this);
        fm.addActionListener(this);
        pn.addActionListener(this);
        fg.addActionListener(this);
        calc.addActionListener(this);
        backLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ac) {
            new AgeCalculator();
            frame.setVisible(false);
        }
        if (e.getSource() == cf) {
            new c_f();
            frame.setVisible(false);
        }
        if (e.getSource() == eo) {
            new EvenOdd();
            frame.setVisible(false);
        }
        if (e.getSource() == factorial) {
            new factorial();
            frame.setVisible(false);
        }
        if (e.getSource() == km) {
            new km_mtr();
            frame.setVisible(false);
        }
        if (e.getSource() == fm) {
            new mtr_ft();
            frame.setVisible(false);
        }
        if (e.getSource() == pn) {
            new PrimeNumbers();
            frame.setVisible(false);
        }
        if (e.getSource() == fg) {
            FindGrade fgr = new FindGrade();
            fgr.main(null);
            frame.setVisible(false);
        }
        if (e.getSource() == calc) {
            new ProjCalculator();
            frame.setVisible(false);
        }
        if (e.getSource() == backLogin) {
            new signup();
            frame.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Programs();
    }
}
