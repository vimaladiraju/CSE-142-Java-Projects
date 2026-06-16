// Source code for custom class DrawingPanel: https://courses.cs.washington.edu/courses/cse142/20sp/lectures/DrawingPanel.java

import java.awt.*;

public class Car2 {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(400, 200);
		panel.setBackground(Color.LIGHT_GRAY);
		Graphics g = panel.getGraphics();
		
		drawCar(10, 30, 30, g);
		drawCar(150, 10, 50, g);
	}
	
	public static void drawCar(int x, int y, int size, Graphics g) {
		// draw body
		g.setColor(Color.BLACK);
		g.fillRect(x, y, size, size / 2);
		
		// draw window
		g.setColor(Color.CYAN);
		g.fillRect(x + 7 * size / 10, y + size / 10, 3 * size / 10, size / 5);
		
		// draw wheels
		g.setColor(Color.RED);
		g.fillOval(x + size / 10, y + 2 * size / 5, size / 5, size / 5);
		g.fillOval(x + 7 * size / 10, y + 2 * size / 5, size / 5, size / 5);
	}
}
