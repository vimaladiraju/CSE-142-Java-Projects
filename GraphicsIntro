// Source code for custom class DrawingPanel: https://courses.cs.washington.edu/courses/cse142/20sp/lectures/DrawingPanel.java

import java.awt.*;

public class GraphicsIntro {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(400, 200);
		panel.setBackground(Color.LIGHT_GRAY);
		Graphics g = panel.getGraphics();
		
		drawCar(10, 30, g);
		drawCar(150, 10, g);
	}
	
	public static void drawCar(int x, int y, Graphics g) {
		// draw body
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 100, 50);
		
		// draw window
		g.setColor(Color.CYAN);
		g.fillRect(x + 70, y + 10, 30, 20);
		
		// draw wheels
		g.setColor(Color.RED);
		g.fillOval(x + 10, y + 40, 20, 20);
		g.fillOval(x + 70, y + 40, 20, 20);
	}
}
