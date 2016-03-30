import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorldButton {
	private static final String HELLO_WORLD = "Hello World !";

	public static void main(String[] args) {
		JFrame myFrame = new JFrame(HELLO_WORLD);
		JButton myButton = new JButton(HELLO_WORLD);
		myButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(HELLO_WORLD);
			}
		});
		myFrame.getContentPane().add(myButton);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.setVisible(true);
	}
}