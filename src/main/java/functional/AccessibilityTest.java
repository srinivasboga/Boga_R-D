package functional;
import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleRole;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AccessibilityTest {
	public static void main(String[] args) {
		// Create a JFrame
		JFrame frame = new JFrame("Accessibility Test");
		
		// Create a JButton
		JButton button = new JButton("Click me");
		
		// Get the AccessibleContext of the JButton
		AccessibleContext context = button.getAccessibleContext();
		
		// Get the AccessibleRole of the JButton
		AccessibleRole role = context.getAccessibleRole();
		
		// Print the AccessibleRole
		System.out.println("AccessibleRole: " + role);
		
		// Add the JButton to the JFrame
		frame.getContentPane().add(button);
		
		// Set the JFrame to be visible
		frame.setVisible(true);
	}
}