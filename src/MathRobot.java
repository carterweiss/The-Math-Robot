import java.awt.FlowLayout;
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
		// This line arranges the label and buttons horizontally.
		horizontal.setLayout(new BoxLayout(horizontal, BoxLayout.PAGE_AXIS));
		// Please do not change the following line.
		buttonPanel.setLayout(new FlowLayout());
		// We have to add all of the buttons to the buttonPanel, like what is shown below.
		buttonPanel.add(addition);
		buttonPanel.add(subtraction);
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