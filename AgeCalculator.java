
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgeCalculator {

    String st;

    AgeCalculator() {
        JFrame frame = new JFrame("Age Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(260, 300);

        JLabel birth = new JLabel("Birth:");
        birth.setBounds(10, 20, 80, 30);
        frame.add(birth);

        JLabel current = new JLabel("Current Year:");
        current.setBounds(10, 60, 80, 30);
        frame.add(current);

        JTextField birth_year = new JTextField();
        birth_year.setBounds(100, 20, 100, 30);
        frame.add(birth_year);

        JTextField current_year = new JTextField();
        current_year.setBounds(100, 60, 100, 30);
        frame.add(current_year);

        JLabel result = new JLabel();
        result.setBounds(20, 140, 200, 30);
        result.setHorizontalAlignment(JLabel.CENTER);
        frame.add(result);

        JButton history = new JButton("History");
        history.setBounds(20, 170, 200, 30);
        history.setHorizontalAlignment(JLabel.CENTER);
        frame.add(history);

        JTextArea hs = new JTextArea();
        hs.setBounds(20, 200, 200, 80);
        frame.add(hs);

        JButton calculate = new JButton("Calculate");
        calculate.setBounds(100, 100, 120, 30);
        frame.add(calculate);

        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                

                    int birthy = Integer.parseInt(birth_year.getText());
                    int currenty = Integer.parseInt(current_year.getText());
                    result.setText("Your age is: " + (currenty - birthy) + " yr/s");
			try {
                    FileWriter wrt = new FileWriter("AgeCalc.txt", true);
                    BufferedWriter bWriter = new BufferedWriter(wrt);

                
            
                    bWriter.newLine();
                    bWriter.write("Birth year: " + birth_year.getText());
                    bWriter.write("\n");
                    bWriter.write("Current year: " + current_year.getText());
                    bWriter.write("\n");
                    bWriter.write(result.getText());
                    bWriter.close();

                } catch (Exception ea) {
                    JOptionPane.showMessageDialog(frame, "Please enter Integer values only.", "Error!",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        history.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    FileReader rdr = new FileReader("AgeCalc.txt");
                    BufferedReader brReader = new BufferedReader(rdr);

                    int chr = brReader.read();
                    while (chr != -1) {
                        char theChar = (char) chr;
                        hs.setText(" " + theChar);
                        chr = brReader.read();
                    }
                    brReader.close();

                }

                catch (IOException ae) {
                    JOptionPane.showMessageDialog(frame, "An error occurred");
                }

            }
        });

        // Back button to return the main screen
        JButton back = new JButton("< Menu");
        back.setBounds(10, 100, 80, 30);
        frame.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Programs();
                frame.setVisible(false);
            }
        });
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AgeCalculator();
    }
}
