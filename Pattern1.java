// Source code for custom class DrawingPanel: https://courses.cs.washington.edu/courses/cse142/20sp/lectures/DrawingPanel.java

import java.awt.*;

public class Pattern1 {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(500, 400);
		panel.setBackground(Color.CYAN);
		Graphics g = panel.getGraphics();
		
		Pattern(50, 50, 150, 150, g);
		Pattern(100, 200, 200, 300, g);
		Pattern(250, 150, 325, 225, g);
	}
	
	public static void Pattern(int x_left, int y_up, int x_right, int y_down, Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x_left, y_up, (x_right - x_left), (y_down - y_up));
		g.setColor(Color.BLACK);
		g.drawRect(x_left, y_up, (x_right - x_left), (y_down - y_up));
		
		g.setColor(Color.GREEN);
		g.fillOval(x_left, y_up, (x_right - x_left), (y_down - y_up));
		
		g.setColor(Color.BLACK);
		g.drawOval(x_left, y_up, (x_right - x_left), (y_down - y_up));

		g.drawLine(x_left, y_up, x_right, y_down);
		g.drawLine(x_right, y_up, x_left, y_down);
		
	}
}
