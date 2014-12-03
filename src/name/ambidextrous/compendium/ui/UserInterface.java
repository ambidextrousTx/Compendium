package name.ambidextrous.compendium.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UserInterface implements ActionListener {
	private JButton button;
	
	public static void main (String [] args) {
		UserInterface ui = new UserInterface();
		ui.go();
	}
	
	private void go() {
		JFrame frame = new JFrame();
		button = new JButton();
		button.addActionListener(this);
		button.setText("Click me!");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		frame.setSize(800, 600);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("I was clicked");
		
	}
}
