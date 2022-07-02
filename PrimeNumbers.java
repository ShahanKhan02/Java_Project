
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class PrimeNumbers {

    public PrimeNumbers() {

        frame();
    }

    public void frame() {

        JFrame frm = new JFrame("Prime Numbers");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(240, 210);
        frm.setResizable(false);
        frm.setLocationRelativeTo(null);

        JTextField tf = new JTextField(5);
        tf.setBounds(60, 40, 100, 30);
        frm.add(tf);

        JLabel lb1 = new JLabel("Identify Prime number!");
        lb1.setBounds(50, 10, 150, 30);
        frm.add(lb1);

        JLabel lb = new JLabel();
        lb.setBounds(40, 70, 180, 30);
        frm.add(lb);

        JButton btn = new JButton("Check!");
        btn.setBounds(60, 100, 100, 30);
        frm.add(btn);

        JButton back = new JButton("< Menu");
        back.setBounds(70, 135, 80, 30);
        frm.add(back);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(tf.getText());
                    int a, b, c;

                    for (a = 1; a <= value; a++) {
                        c = 0;
                        for (b = 1; b <= a; b++) {
                            if (a % b == 0) {
                                c++;
                            } else {
                                lb.setForeground(Color.RED);
                                lb.setText(value + " is not a Prime Number.");
                            }
                        }
                        if (c == 2) {
                            lb.setForeground(Color.GREEN);
                            lb.setText(value + " is a Prime Number.");
                        }

                    }
                    
                    
                    FileWriter writ = new FileWriter("Prime Numbers.txt", true);
                    BufferedWriter bWriter = new BufferedWriter(writ);

                    bWriter.newLine();
                    bWriter.newLine();
                    bWriter.write("Number: " + tf.getText());
                    bWriter.newLine();
                    bWriter.write(lb.getText());
                    bWriter.close();
                    
                } catch (Exception ab) {
                    JOptionPane.showMessageDialog(frm, "Please enter any integer value.", "Error",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });
        // Back button to return the main screen
        frm.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Programs();
                frm.setVisible(false);
            }
        });

        frm.setLayout(null);
        frm.setVisible(true);

    }

    public static void main(String[] args) {
        new PrimeNumbers();
    }
}
