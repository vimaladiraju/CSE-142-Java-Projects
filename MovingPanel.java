// Source code for custom class DrawingPanel: https://courses.cs.washington.edu/courses/cse142/20sp/lectures/DrawingPanel.java

import java.awt.*;

public class MovingPanel {
	public static void main(String[] args) {
		double velocity = 38.4;
		double angle = 45.0;
		int seconds = 15;
		
		double xVelocity = velocity * Math.cos(Math.toRadians(angle));
		double yVelocity = -velocity * Math.sin(Math.toRadians(angle));
		
		DrawingPanel panel = new DrawingPanel(600, 600);
		panel.setBackground(Color.CYAN);
		Graphics g = panel.getGraphics();
		
		// draw initial ball
		g.fillOval(295,  295,  10,  10);
		panel.sleep(1000);
		
		double x = 300.0;
		double y = 300.0;
		for (int i = 1; i <= 10 * seconds; i++) {
			g.setColor(Color.WHITE);
			g.fillOval((int) x - 5, (int) y - 5, 10, 10);
			x = x + xVelocity / 10.0;
			y = y + yVelocity / 10.0;
			g.setColor(Color.BLACK);
			g.fillOval((int) x - 5, (int) y - 5, 10, 10);
			panel.sleep(100);
		}
		
	}
}
