package cn.cxx.book;

import javax.swing.*;

public class MyFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("MyFrame"); // Create a frame
		frame.setSize(400, 300); // Set the frame size
		frame.setLocationRelativeTo(null); // New since JDK 1.4
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton jbtok = new JButton("ok");
		frame.add(jbtok);
		// frame.remove(jbtok);

		frame.pack();
		frame.setVisible(true); // Display the frame
	}
}
