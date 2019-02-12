import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MathRobot {
	// This is the main window frame.  Don't mess with it, or bad things can happen.
	final static JFrame main = new JFrame("The Math Robot");
	// This is the label that tells you to push a button.  Please do not change it.
	static JLabel label = new JLabel("Press a button to use its labeled operation.");
	// This is the JPanel that holds all of the buttons.  You can add your buttons to this panel to make them appear.
	static JPanel buttonPanel = new JPanel();
	// This JPanel holds the components together horizontally.
	static JPanel horizontal = new JPanel();
	// You can create your own buttons like how they are shown below.
	static JButton addition = new JButton("Addition");
	static JButton subtraction = new JButton("Subtraction");
	static JButton multiplication = new JButton("Multiplication");
	static JButton division = new JButton("Division");
	static JButton isPrimeNumber = new JButton("Prime Number Test");
	public static void main(String[] args)
	{
		// This line stops the program when the window is closed.  It is very important.
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// This line arranges the label and buttons horizontally.
		horizontal.setLayout(new BoxLayout(horizontal, BoxLayout.PAGE_AXIS));
		// Please do not change the following line.
		buttonPanel.setLayout(new FlowLayout());
		// We have to add all of the buttons to the buttonPanel, like what is shown below.  Each button also needs to have a MouseListener added, and its action can be placed in the mouseClicked method.
		buttonPanel.add(addition);
		addition.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number."));
				int numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number."));
				JOptionPane.showMessageDialog(null, "The answer is " + Integer.toString((numberOne + numberTwo)) + ".", "Your Answer", JOptionPane.PLAIN_MESSAGE, null);
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		buttonPanel.add(subtraction);
		subtraction.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number."));
				int numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
				JOptionPane.showMessageDialog(null, "The answer is " + Integer.toString(numberOne - numberTwo) + ".", "Your Answer", JOptionPane.PLAIN_MESSAGE);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonPanel.add(division);
		buttonPanel.add(multiplication);
		buttonPanel.add(isPrimeNumber);
		// Please do not change the following five lines.  They are very important.
		horizontal.add(label);
		horizontal.add(buttonPanel);
		main.add(horizontal);
		main.pack();
		main.setVisible(true);
	}
}