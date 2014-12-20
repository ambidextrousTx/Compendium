package name.ambidextrous.compendium.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class UserInterface implements ActionListener {
	private JButton button;
	
	public static void main (String [] args) {
		UserInterface ui = new UserInterface();
		ui.go();
	}
	
	private void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		
		JTextArea textArea = new JTextArea(10, 40);
		textArea.setLineWrap(true);
		
		JScrollPane scroller = new JScrollPane(textArea);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		button = new JButton();
		button.addActionListener(this);
		button.setText("Click me!");
		
		mainPanel.add(scroller);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.setSize(800, 600);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("I was clicked");
		
	}
}
