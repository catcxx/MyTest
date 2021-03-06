package cn.cxx.book;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.util.Date;

public class DrawArcs extends JFrame {
	public DrawArcs() {
		setTitle("DrawArcs");
		ArcsPanel ap = new ArcsPanel();
		add(ap);
	}

	/** Main method */
	public static void main(String[] args) {
		DrawArcs frame = new DrawArcs();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 300);
		frame.setVisible(true);
	}
}

// The class for drawing arcs on a panel
class ArcsPanel extends JPanel {
	// Draw four blazes of a fan
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

		int x = xCenter - radius;
		int y = yCenter - radius;
		long gettt = System.currentTimeMillis();

		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);

		// for(int i = 0;i<100000;i++){
		//
		//
		// g.fillArc(x, y, 2 * radius, 2 * radius, 30, 30);
		// g.fillArc(x, y, 2 * radius, 2 * radius, 120, 30);
		// g.fillArc(x, y, 2 * radius, 2 * radius, 210, 30);
		// g.fillArc(x, y, 2 * radius, 2 * radius, 300, 30);
		//// super.repaint();
		// }

	}
}
