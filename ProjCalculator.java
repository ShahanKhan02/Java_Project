
// A calculator made in constructor and main method only. This method is recommended only for the beginners
// to understand the use of different objects of swing and awt packages.
// This program is written by me with full dedication.
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


//Implementing ActionListener interface
class ProjCalculator implements ActionListener {

    // defining some varianles(Globally) which will be used in constructor to get
    // values from the user and store the result in 'answer'.
    double fnumber, snumber, answer, snmbr;

    // Defined calculation for the operators which will be used in switch statement.
    int calculation;

    String result;

    // Defining the required object globally so it can be accessed everywhere in the
    // program.
    JFrame jf = new JFrame("Calculator");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");
    JButton sub = new JButton("-");
    JButton add = new JButton("+");
    JButton div = new JButton("/");
    JButton multiply = new JButton("x");
    JButton point = new JButton(".");
    JButton c = new JButton("AC");
    JButton reciprocal = new JButton("+/-");
    JButton sqrt = new JButton("\u221A");
    JButton prcntge = new JButton("%");
    JButton equal = new JButton("=");
    ImageIcon icon = new ImageIcon("F:\\Abdul Basit Khan\\JAVA\\_Files\\GUI\\Icons\\backee.png");
    JButton backspace = new JButton(icon);
    JButton back = new JButton("QUIT");
    JLabel lb = new JLabel("");
    JLabel credit = new JLabel("Developed by: Abdul Basit Khan");
    JTextField ta = new JTextField();
    Font ft = new Font("Poppins", Font.BOLD, 30); // for TextField
    Font ft1 = new Font("Segui UI", Font.ITALIC, 10); // for Credit
    Font ft2 = new Font("Segui UI", Font.PLAIN, 18); // for Buttons
    Font ft3 = new Font("Segui UI", Font.PLAIN, 12);

    // constructor, where all of the work will be done.
    ProjCalculator() {

        gui();
        setComponents();
        addComponents();
        addActions();

    }

    public void gui() {
        // JFrame settings
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(380, 430);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public void setComponents() {
        // Styling the buttons
        one.setFont(ft2);
        two.setFont(ft2);
        three.setFont(ft2);
        four.setFont(ft2);
        five.setFont(ft2);
        six.setFont(ft2);
        seven.setFont(ft2);
        eight.setFont(ft2);
        nine.setFont(ft2);
        zero.setFont(ft2);
        point.setFont(ft2);
        add.setFont(ft2);
        sub.setFont(ft2);
        multiply.setFont(ft2);
        div.setFont(ft2);
        c.setFont(ft2);
        equal.setBackground(Color.GREEN);
        backspace.setBackground(Color.RED);
        ta.setFont(ft);
        credit.setForeground(Color.DARK_GRAY);
        credit.setFont(ft1);
        prcntge.setFont(ft2);
        sqrt.setFont(ft2);
        reciprocal.setFont(ft2);
        lb.setFont(ft3);
        back.setFont(new Font("Poppins", Font.BOLD, 12));
        back.setBackground(Color.orange);
        back.setFocusPainted(false);

        // arranging the position and size of the button on the frame.
        one.setBounds(10, 260, 62, 50);
        two.setBounds(80, 260, 62, 50);
        three.setBounds(150, 260, 62, 50);
        four.setBounds(10, 200, 62, 50);
        five.setBounds(80, 200, 62, 50);
        six.setBounds(150, 200, 62, 50);
        seven.setBounds(10, 140, 62, 50);
        eight.setBounds(80, 140, 62, 50);
        nine.setBounds(150, 140, 62, 50);
        reciprocal.setBounds(10, 320, 62, 50);
        sub.setBounds(220, 260, 62, 50);
        equal.setBounds(220, 320, 62, 50);
        div.setBounds(220, 200, 62, 50);
        multiply.setBounds(220, 140, 62, 50);
        zero.setBounds(80, 320, 62, 50);
        c.setBounds(80, 80, 132, 50);
        backspace.setBounds(220, 80, 135, 50);
        point.setBounds(150, 320, 62, 50);
        add.setBounds(290, 260, 62, 110);
        prcntge.setBounds(290, 200, 62, 50);
        sqrt.setBounds(290, 140, 62, 50);
        ta.setBounds(5, 10, 350, 40);
        lb.setBounds(10, 50, 350, 30);
        ta.setHorizontalAlignment(JTextField.RIGHT);
        lb.setHorizontalAlignment(JLabel.CENTER);
        credit.setBounds(10, 365, 200, 30);
        back.setBounds(10, 80, 62, 50);

    }

    public void addComponents() {
        // Adding buttons on the frame.
        jf.add(one);
        jf.add(two);
        jf.add(three);
        jf.add(four);
        jf.add(five);
        jf.add(six);
        jf.add(seven);
        jf.add(eight);
        jf.add(nine);
        jf.add(zero);
        jf.add(sub);
        jf.add(add);
        jf.add(div);
        jf.add(multiply);
        jf.add(point);
        jf.add(c);
        jf.add(backspace);
        jf.add(equal);
        jf.add(ta);
        jf.add(lb);
        jf.add(credit);
        jf.add(reciprocal);
        jf.add(sqrt);
        jf.add(prcntge);
        jf.add(back);
    }

    public void addActions() {
        // ActionListener for the buttons from ActionListener Interface.
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        sub.addActionListener(this);
        add.addActionListener(this);
        div.addActionListener(this);
        multiply.addActionListener(this);
        point.addActionListener(this);
        c.addActionListener(this);
        backspace.addActionListener(this);
        equal.addActionListener(this);
        sqrt.addActionListener(this);
        reciprocal.addActionListener(this);
        prcntge.addActionListener(this);
        back.addActionListener(this);
        ;
    }

    // ActionPerfromed on the button which is performed through ActionEvent declared
    // as e.
    public void actionPerformed(ActionEvent e) {

        // ActionEvent e is the Event handler, e will get the source from
        // addActionListener.
        Object source = e.getSource();

        if (source == c) {
            ta.setText(null); // Clear the textfield
            lb.setText(null); // Clear the Label(under the textfield)

        } else if (source == backspace) {
            // This will remove a pressed digit from the textfield.
            Document doc = ta.getDocument();
            if (doc.getLength() > 0) {
                try {
                    doc.remove(doc.getLength() - 1, 1);
                } catch (Exception a) {

                }
            }

            // Getting information from the pressed button and setting it in the textfield .
        } else if (source == zero) {
            ta.setText(ta.getText() + "0");
        } else if (source == one) {
            ta.setText(ta.getText() + "1");
        } else if (source == two) {
            ta.setText(ta.getText() + "2");
        } else if (source == three) {
            ta.setText(ta.getText() + "3");
        } else if (source == four) {
            ta.setText(ta.getText() + "4");
        } else if (source == five) {
            ta.setText(ta.getText() + "5");
        } else if (source == six) {
            ta.setText(ta.getText() + "6");
        } else if (source == seven) {
            ta.setText(ta.getText() + "7");
        } else if (source == eight) {
            ta.setText(ta.getText() + "8");
        } else if (source == nine) {
            ta.setText(ta.getText() + "9");
        } else if (source == point) {
            ta.setText(ta.getText() + ".");

            // Here operation for the addition button
        } else if (source == add) {
            // Getting the value from the text after that convert it into Double and then
            // store that value in 'fnumber'.
            fnumber = Double.parseDouble(ta.getText());
            // this value is used in switch statement below to access the required operator
            // in switch.
            calculation = 1;
            // After entering the first value and pressing the operator, the textfield will
            // get empty and ready for the new entry.
            ta.setText("");
            // The first entry(fnumber) will be shown on the label(below the textfield) with
            // the typed button(operator).
            lb.setText(fnumber + "+");

        } else if (source == sub) {
            fnumber = Double.parseDouble(ta.getText());
            calculation = 2;
            ta.setText("");
            lb.setText(fnumber + "-");

        } else if (source == multiply) {
            fnumber = Double.parseDouble(ta.getText());
            calculation = 3;
            ta.setText("");
            lb.setText(fnumber + "*");

        } else if (source == div) {
            fnumber = Double.parseDouble(ta.getText());
            calculation = 4;
            ta.setText("");
            lb.setText(fnumber + "/");
        } else if (source == sqrt) {
            fnumber = Double.parseDouble(ta.getText());
            answer = fnumber * fnumber;
            ta.setText(answer + "");
            lb.setText("");

            // } else if (source == prcntge) {
            // fnumber = Double.parseDouble(ta.getText());
            // ta.setText("");
            // snumber = Double.parseDouble(ta.getText());
            // answer = (snumber*100)/answer;
            // lb.setText("");

            // } else if (source == prcntge) {
            // fnumber = Double.parseDouble(ta.getText());
            // String snmbrs = lb.getText();
            // if (snmbrs.endsWith("*"));
            // {
            // ta.setText(snmbrs.replace("*", ""));
            // Double snmbr = Double.parseDouble(snmbrs);
            // answer = (fnumber * 100) / snmbr;
            // result = Double.toString(answer);
            // result = String.format("%.2f", answer);
            // ta.setText(result);
            // lb.setText("");
            // }

        } else if (source == reciprocal) {
            answer = answer * -1;
            ta.setText(answer + "");
            lb.setText("");
            // Here is the main work which will be done on equal button.
        } else if (source == equal) {
            // Here second entry will be entered.
            snumber = Double.parseDouble(ta.getText());

            // the calculation which we have entered in above statements for the buttons,
            // will be used here.
            switch (calculation) {
                case 1:
                    answer = fnumber + snumber;
                    result = String.format("%.2f", answer);
                    break;
                case 2:
                    answer = fnumber - snumber;
                    result = String.format("%.2f", answer);
                    break;
                case 3:
                    answer = fnumber * snumber;
                    result = String.format("%.2f", answer);
                    break;
                case 4:
                    answer = fnumber / snumber;
                    result = String.format("%.2f", answer);
                    break;
                case 5:
                    answer = fnumber / 100;
                    result = String.format("%.2f", answer);
                    break;
                default:
                    answer = 0;
            }

            // The answer will be shown in the textfield.
            ta.setText("" + result);
            // Label will get empty when the answer is shown in the textfield.
            lb.setText("");
            try {

                FileWriter writ = new FileWriter("Project Calculator.txt", true);
                BufferedWriter bWriter = new BufferedWriter(writ);

                bWriter.newLine();
                bWriter.write("First number: " + fnumber);
                bWriter.newLine();
                bWriter.write("Second answer: " + snumber);
                bWriter.newLine();
                bWriter.write("Result: " + result);
                bWriter.newLine();
                bWriter.close();
            } catch (IOException ax) {
                ax.printStackTrace();
            }
            // It will remove .0 at the end of the number. i.e 2+2=4 rather than 4.0
            // if (Double.toString(answer).endsWith(".0"));
            // {
            // ta.setText(Double.toString(answer).replace(".0", ""));
            // }

        }
        if (source == back) {
            new Programs();
            jf.setVisible(false);
        }

    }

    public static void main(String args[]) {

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
        new ProjCalculator();

    }

}
