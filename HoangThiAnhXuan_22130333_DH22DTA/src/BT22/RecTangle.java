package BT22;

import java.awt.Color;
import java.awt.Graphics;

public class RecTangle extends Shape {
	int height, width;

	public RecTangle(Point1 p1, Color color, int type, boolean isFill) {
		super(p1, color, type, isFill);
		this.width = 0;
		this.height = 0;

	}

	@Override
	public void resize(Point1 p) {
		this.p2 = p;
		this.width = Math.abs(p2.x - p1.x);
		this.height = Math.abs(p2.y - p1.y);

	}

	@Override
	public void draw(Graphics g) {
		if (isFill) {
			g.fillRect(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), width, height);
		} else {
			g.drawRect(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), width, height);
		}
	}

}
