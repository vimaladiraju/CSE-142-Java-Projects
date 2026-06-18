// Source code for custom class DrawingPanel: https://courses.cs.washington.edu/courses/cse142/20sp/lectures/DrawingPanel.java

import java.awt.*;

public class CafeWall {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(650, 400);
		panel.setBackground(Color.GRAY);
		Graphics g = panel.getGraphics();
		
		freeRow(0, 0, 4, 20, g);
		freeRow(50, 70, 5, 30, g);
		
		grid(10, 150, 4, 25, 0, g);
		grid(250, 200, 3, 25, 10, g);
		grid(425, 180, 5, 20, 10, g);
		grid(400, 20, 2, 35, 35, g);
	}
	
	public static void freeRow(int x, int y, int pairs, int size, Graphics g) {
		for (int i = 0; i < pairs; i++) {
			drawPair(x + (size * i * 2), y, size, g);
		}
	}
	
	public static void grid(int x, int y, int pairs, int size, int offset, Graphics g) {
		for (int i = 0; i < pairs*2; i++) {
			for (int j = 0; j < pairs; j++) {
				if (i % 2 == 0) {
					drawPair(x + (size * j * 2), y + ((size+2) * i), size, g);
				} else {
					drawPair(x + (size * j * 2) + offset, y + ((size+2) * i), size, g);
				}
			}
		}
	}
	
	public static void drawPair(int x, int y, int size, Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, size, size);
		g.setColor(Color.BLUE);
		g.drawLine(x, y, (x+size), (y+size));
		g.drawLine((x+size), y, x, (y+size));
		g.setColor(Color.WHITE);
		g.fillRect((x+size), y, size, size);
	}
}
