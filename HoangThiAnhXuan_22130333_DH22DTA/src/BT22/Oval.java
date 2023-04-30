package BT22;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape {
	int width, hight;

	public Oval(Point1 p1, Color color, int type, boolean isFill) {
		super(p1, color, type, isFill);
	}

	@Override
	public void resize(Point1 p) {
		this.p2 = new Point1(p.x, p.y);
		this.width = Math.abs(p2.x - p1.x);
		this.hight = Math.abs(p2.y - p1.y);
	}

	@Override
	public void draw(Graphics g) {
		if (isFill) {
			g.fillOval(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), width, hight);
		} else {
			g.drawOval(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), width, hight);
		}
	}
}
