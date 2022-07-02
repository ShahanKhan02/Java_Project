
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class factorial implements ActionListener {
	JFrame frame = new JFrame("Factorial");
	JButton button = new JButton("Find");
	JButton back = new JButton("< Menu");
	JTextField tf = new JTextField();
	JLabel labl = new JLabel("Enter a number: ");
	JLabel title = new JLabel("*FACTORIAL*");
	JLabel labl1 = new JLabel();

	int numbr, fact = 1;

	factorial() {
		gui();
		settingComponents();
		addComponents();
		addActions();

	}

	public void gui() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 250);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
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
		labl1.setBounds(20, 150, 200, 30);
		button.setBounds(120, 120, 80, 30);
		back.setBounds(20, 120, 80, 30);
		tf.setBounds(20, 80, 180, 30);
		title.setBounds(20, 10, 180, 30);
		Font t = new Font("Tahoma", Font.BOLD, 14);
		title.setFont(t);
		title.setHorizontalAlignment(JLabel.CENTER);

	}

	public void addActions() {
		button.addActionListener(this);
		back.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			try {
				numbr = Integer.parseInt(tf.getText());
				

				FileWriter writ = new FileWriter("Factorial.txt", true);
				BufferedWriter bWriter = new BufferedWriter(writ);

				bWriter.newLine();
				bWriter.write("Number: " + tf.getText());
				bWriter.newLine();
				
				fact = 1;
				for (int i = 1; i <= numbr; i++) {
					fact = fact * i;
				}
				tf.setText(null);
				labl1.setText("The Factorial of " + numbr + " is " + fact);
				bWriter.write(labl1.getText());
				bWriter.close();
			} catch (Exception ea) {
				JOptionPane.showMessageDialog(frame, "Please enter Integer value only.", "Error!",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

		if (e.getSource() == back) {
			new Programs();
			frame.setVisible(false);
		}
	}

	public static void main(String args[]) {
		new factorial();
	}
}
