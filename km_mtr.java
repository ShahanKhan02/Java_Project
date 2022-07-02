
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class km_mtr implements ActionListener {

    JFrame f = new JFrame("Kilometer to Meter");
    JLabel heading = new JLabel("*Kilometer to Meter*");
    JLabel km = new JLabel("Kilometer:");
    JLabel mtrkm = new JLabel("Meter to Kilometer: ");
    JTextField Tkm = new JTextField();
    ImageIcon icn = new ImageIcon("F:\\Abdul Basit Khan\\JAVA\\_Files\\GUI\\Projects\\Project\\resources\\con.png");
    JButton k_m = new JButton(icn);
    JLabel result = new JLabel();
    JButton calculate = new JButton("Calculate");
    JButton back = new JButton("< Menu");

    Double val, res;

    km_mtr() {
        gui();
        setComponents();
        addComponents();
        addActions();
    }

    public void gui() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setSize(260, 220);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void setComponents() {

        heading.setFont(new Font("Microsoft sans serif", Font.BOLD, 14));
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setBounds(20, 5, 200, 30);
        km.setBounds(10, 40, 80, 30);
        mtrkm.setBounds(10, 80, 120, 30);
        Tkm.setBounds(70, 40, 130, 30);
        k_m.setBounds(100, 80, 100, 30);
        k_m.setBorderPainted(false);
        k_m.setBorder(null);
        k_m.setContentAreaFilled(false);
        result.setBounds(20, 150, 200, 30);
        result.setHorizontalAlignment(JLabel.CENTER);
        calculate.setBounds(100, 120, 100, 30);
        back.setBounds(10, 120, 80, 30);
    }

    public void addComponents() {
        f.add(k_m);
        f.add(heading);
        f.add(km);
        f.add(mtrkm);
        f.add(Tkm);
        f.add(result);
        f.add(calculate);
        f.add(back);

    }

    public void addActions() {
        k_m.addActionListener(this);
        calculate.addActionListener(this);
        back.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == k_m) {
            new mtr_km();
            f.setVisible(false);
        }
        if (e.getSource() == calculate) {
            try {
                val = Double.parseDouble(Tkm.getText());
                result.setText(Tkm.getText() + " Km(s) are " + (val * 1000) + " meter(s)");
                

                FileWriter writ = new FileWriter("Km to M.txt", true);
                BufferedWriter bWriter = new BufferedWriter(writ);

                bWriter.newLine();
                bWriter.newLine();
                bWriter.write("Kilometer: " + Tkm.getText());
                bWriter.newLine();
                bWriter.write(result.getText());
                bWriter.close();
            } catch (Exception ea) {
                JOptionPane.showMessageDialog(f, "Please enter Integer value only.", "Alert!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (e.getSource() == back) {
            new Programs();
            f.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new km_mtr();
    }
}

class mtr_km implements ActionListener {
    JFrame f = new JFrame("Meter to Kilometer");
    JLabel heading = new JLabel("*Meter to Kilometer*");
    JLabel km = new JLabel("Meter(s):");
    JLabel mtrkm = new JLabel("Kilometer to Meter: ");
    JTextField Tkm = new JTextField();
    ImageIcon icn = new ImageIcon("F:\\Abdul Basit Khan\\JAVA\\_Files\\GUI\\Projects\\Project\\resources\\con.png");
    JButton k_m = new JButton(icn);
    JLabel result = new JLabel();
    JButton calculate = new JButton("Calculate");
    JButton back = new JButton("< Menu");

    Double val, res;

    mtr_km() {
        gui();
        setComponents();
        addComponents();
        addActions();
    }

    public void gui() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setSize(260, 220);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void setComponents() {

        heading.setFont(new Font("Microsoft sans serif", Font.BOLD, 14));
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setBounds(20, 5, 200, 30);
        km.setBounds(10, 40, 80, 30);
        mtrkm.setBounds(10, 80, 120, 30);
        Tkm.setBounds(70, 40, 130, 30);
        k_m.setBounds(100, 80, 100, 30);
        k_m.setBorderPainted(false);
        k_m.setBorder(null);
        k_m.setContentAreaFilled(false);
        result.setBounds(20, 150, 200, 30);
        result.setHorizontalAlignment(JLabel.CENTER);
        calculate.setBounds(100, 120, 100, 30);
        back.setBounds(10, 120, 80, 30);
    }

    public void addComponents() {
        f.add(k_m);
        f.add(heading);
        f.add(km);
        f.add(mtrkm);
        f.add(Tkm);
        f.add(result);
        f.add(calculate);
        f.add(back);

    }

    public void addActions() {
        k_m.addActionListener(this);
        calculate.addActionListener(this);
        back.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == k_m) {
            new km_mtr();
            f.setVisible(false);
        }
        if (e.getSource() == calculate) {
            try {
                val = Double.parseDouble(Tkm.getText());
                result.setText(Tkm.getText() + " Meter(s) are " + (val / 1000) + " Kilometer(s)");
                // Writing data into text file.
                DateFormat sf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Date dateObj = new Date();

                FileWriter writ = new FileWriter("Km to M.txt", true);
                BufferedWriter bWriter = new BufferedWriter(writ);

                bWriter.newLine();
                bWriter.write(sf.format(dateObj));
                bWriter.newLine();
                bWriter.write("Meter: " + Tkm.getText());
                bWriter.newLine();
                bWriter.write(result.getText());
                bWriter.close();
            } catch (Exception ea) {
                JOptionPane.showMessageDialog(f, "Please enter Integer value only.", "Alert!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (e.getSource() == back) {
            new Programs();
            f.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new km_mtr();
    }
}
