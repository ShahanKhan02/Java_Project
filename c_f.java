import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class c_f {
    Double val, res;

    c_f() {
        gui();
    }

    public void gui() {
        JFrame f = new JFrame("Celsius to Fahrenheit");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setSize(260, 220);
        f.setLocationRelativeTo(null);

        // heading
        JLabel heading = new JLabel("*Celsius to Fahrenheit*");
        heading.setFont(new Font("Microsoft sans serif", Font.BOLD, 14));
        heading.setBounds(30, 5, 200, 30);
        f.add(heading);

        JLabel celsius = new JLabel("Celsius:");
        celsius.setBounds(10, 40, 50, 30);
        f.add(celsius);

        JLabel fahrenheit = new JLabel("\u2109  to \u2103: ");
        fahrenheit.setBounds(10, 80, 70, 30);
        f.add(fahrenheit);

        JTextField Tcelsius = new JTextField();
        Tcelsius.setBounds(100, 40, 100, 30);
        f.add(Tcelsius);

        Icon icn = new ImageIcon("F:\\Abdul Basit Khan\\JAVA\\_Files\\GUI\\Projects\\Project\\resources\\con.png");
        JButton c_f = new JButton(icn);
        c_f.setBounds(100, 80, 100, 30);
        c_f.setBorderPainted(false);
        c_f.setBorder(null);
        c_f.setContentAreaFilled(false);
        f.add(c_f);

        c_f.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new f_c();
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
                    val = Double.parseDouble(Tcelsius.getText());
                    Double ans = (val * 1.8) + 32;
                    String res = String.format("%.2f", ans);
                    result.setText(Tcelsius.getText() + "\u2103 is equal to " + res + "\u2109");
                    // Writing data into text file.
                  
                    FileWriter writ = new FileWriter("Celsius to Fahrenheit.txt", true);
                    BufferedWriter bWriter = new BufferedWriter(writ);

                    bWriter.newLine();
                    bWriter.newLine();
                    bWriter.write("Celsius: " + Tcelsius.getText());
                    bWriter.newLine();
                    bWriter.write(result.getText());
                    bWriter.close();
                } catch (Exception ea) {
                    JOptionPane.showMessageDialog(f, "Please enter Integer value only.", "Error!",
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
        new c_f();
    }
}

class f_c {
    Double val, res;
    JFrame frame;

    f_c() {
        gui();
    }

    public void gui() {
        frame = new JFrame("Fahrenheit to Celsius");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(260, 220);

        // heading
        JLabel heading = new JLabel("*Fahrenheit to Celsius*");
        heading.setFont(new Font("Microsoft sans serif", Font.BOLD, 14));
        heading.setBounds(30, 5, 200, 30);
        frame.add(heading);

        JLabel fahrenheit = new JLabel("Fahrenheit:");
        fahrenheit.setBounds(10, 40, 70, 30);
        frame.add(fahrenheit);

        JLabel celsius = new JLabel("\u2103  to \u2109: ");
        celsius.setBounds(10, 80, 70, 30);
        frame.add(celsius);

        JTextField Tfahrenheit = new JTextField();
        Tfahrenheit.setBounds(100, 40, 100, 30);
        frame.add(Tfahrenheit);

        Icon icn = new ImageIcon("F:\\Abdul Basit Khan\\JAVA\\_Files\\GUI\\Projects\\Project\\resources\\con.png");
        JButton f_c = new JButton(icn);
        f_c.setBounds(100, 80, 100, 30);
        f_c.setBorderPainted(false);
        f_c.setBorder(null);
        f_c.setContentAreaFilled(false);
        frame.add(f_c);

        f_c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new c_f();
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
                    val = Double.parseDouble(Tfahrenheit.getText());
                    Double ans = ((val - 32) * 5 / 9);
                    String res = String.format("%.2f", ans);
                    result.setText(Tfahrenheit.getText() + "\u2109 is equal to " + res + "\u2103");
                    // Writing data into text file.
                    // DateFormat sf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                   // Date dateObj = new Date();

                    FileWriter writ = new FileWriter("Celsius to Fahrenheit.txt", true);
                    BufferedWriter bWriter = new BufferedWriter(writ);

                    bWriter.newLine();
                    bWriter.newLine();
                    bWriter.write("Fahrenheit: " + Tfahrenheit.getText());
                    bWriter.newLine();
                    bWriter.write(result.getText());
                    bWriter.newLine();
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
        new f_c();
    }
}
