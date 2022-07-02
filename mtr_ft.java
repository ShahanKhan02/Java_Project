
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;


class ft_mtr {
    Double val, res;

    ft_mtr() {
        gui();
    }

    public void gui() {
        JFrame f = new JFrame("Feet to Meter");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setSize(260, 220);
        f.setLocationRelativeTo(null);

        // heading
        JLabel heading = new JLabel("*Feet to Meter*");
        heading.setFont(new Font("Microsoft sans serif", Font.BOLD, 14));
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setBounds(20, 5, 200, 30);
        f.add(heading);

        JLabel feet = new JLabel("Feet:");
        feet.setBounds(10, 40, 50, 30);
        f.add(feet);

        JLabel mtrft = new JLabel("Meter to Feet: ");
        mtrft.setBounds(10, 80, 120, 30);
        f.add(mtrft);

        JTextField Tft = new JTextField();
        Tft.setBounds(60, 40, 130, 30);
        f.add(Tft);

        Icon icn = new ImageIcon("F:\\Abdul Basit Khan\\JAVA\\_Files\\GUI\\Projects\\Project\\resources\\con.png");
        JButton f_m = new JButton(icn);
        f_m.setBounds(100, 80, 100, 30);
        f_m.setBorderPainted(false);
        f_m.setBorder(null);
        f_m.setContentAreaFilled(false);
        f.add(f_m);

        f_m.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new mtr_ft();
                f.setVisible(false);
            }
        });

        JLabel result = new JLabel();
        result.setBounds(20, 150, 200, 30);
        result.setHorizontalAlignment(JLabel.CENTER);
        f.add(result);

        JButton calculate = new JButton("Calculate");
        calculate.setBounds(100, 120, 100, 30);
        f.add(calculate);

        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    val = Double.parseDouble(Tft.getText());
                    result.setText(Tft.getText() + " Feet is equal to " + (val * 0.3048) + " meter(s)");

                    

                    FileWriter writ = new FileWriter("Meter to feet.txt", true);
                    BufferedWriter bWriter = new BufferedWriter(writ);

                    bWriter.newLine();
                    bWriter.write("Feet: " + Tft.getText());
                    bWriter.newLine();
                    bWriter.write(result.getText());
                    bWriter.close();
                } catch (Exception ea) {
                    JOptionPane.showMessageDialog(f, "Please enter Integer value only.", "Alert!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Back button to return the main screen
        JButton back = new JButton("< Menu");
        back.setBounds(10, 120, 80, 30);
        f.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Programs();
                f.setVisible(false);
            }
        });

        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ft_mtr();
    }
}

public class mtr_ft {
    Double val, res;
    JFrame frame;

    mtr_ft() {
        gui();
    }

    public void gui() {
        frame = new JFrame("Meter to Feet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(260, 220);

        // heading
        JLabel heading = new JLabel("*Meter to Feet*");
        heading.setFont(new Font("Microsoft sans serif", Font.BOLD, 14));
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setBounds(20, 5, 200, 30);
        frame.add(heading);

        JLabel meter = new JLabel("Meter:");
        meter.setBounds(10, 40, 170, 30);
        frame.add(meter);

        JLabel ftmt = new JLabel("Feet to Meter: ");
        ftmt.setBounds(10, 80, 120, 30);
        frame.add(ftmt);

        JTextField Tfm = new JTextField();
        Tfm.setBounds(60, 40, 130, 30);
        frame.add(Tfm);

        Icon icn = new ImageIcon("F:\\Abdul Basit Khan\\JAVA\\_Files\\GUI\\Projects\\Project\\resources\\con.png");
        JButton f_c = new JButton(icn);
        f_c.setBounds(100, 80, 100, 30);
        f_c.setBorderPainted(false);
        f_c.setBorder(null);
        f_c.setContentAreaFilled(false);
        frame.add(f_c);

        f_c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ft_mtr();
                frame.setVisible(false);
            }
        });

        JLabel result = new JLabel();
        result.setBounds(20, 150, 200, 30);
        result.setHorizontalAlignment(JLabel.CENTER);
        frame.add(result);

        JButton calculate = new JButton("Calculate");
        calculate.setBounds(100, 120, 100, 30);
        frame.add(calculate);

        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    val = Double.parseDouble(Tfm.getText());
                    result.setText(Tfm.getText() + " Meter(s) is equal to " + (val * 3.281) + " feet.");
                    // Writing data into text file.
                    DateFormat sf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date dateObj = new Date();

                    FileWriter writ = new FileWriter("Meter to feet.txt", true);
                    BufferedWriter bWriter = new BufferedWriter(writ);

                    bWriter.newLine();
                    bWriter.write(sf.format(dateObj));
                    bWriter.newLine();
                    bWriter.write("Meter: " + Tfm.getText());
                    bWriter.newLine();
                    bWriter.write(result.getText());
                    bWriter.close();
                } catch (Exception ea) {
                    JOptionPane.showMessageDialog(frame, "Please enter Integer value only.", "Error!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Back button to return the main screen
        JButton back = new JButton("< Menu");
        back.setBounds(10, 120, 80, 30);
        frame.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Programs();
                frame.setVisible(false);
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new mtr_ft();
    }
}
