package cn.cxx.book;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame {
	public ShowFlowLayout() {
		// Set FlowLayout, aligned left with horizontal gap 10
		// and vertical gap 20 between components

		FlowLayout flout = new FlowLayout(FlowLayout.LEFT, 1, 8);
		setLayout(flout);

		// Add labels and text fields to the frame
		add(new JLabel("First Name"));
		add(new JTextField(8));

		add(new JLabel("MI"));
		add(new JTextField(1));

		add(new JLabel("Last Name"));
		add(new JTextField(8));
	}

	/** Main method */
	public static void main(String[] args) {
		ShowFlowLayout frame = new ShowFlowLayout();
		frame.setTitle("ShowFlowLayout");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
