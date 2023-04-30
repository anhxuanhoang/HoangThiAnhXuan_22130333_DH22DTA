package BT22;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape  {

	public Line(Point1 p1, Color color, int type, boolean isFill) {
		super(p1, color, type, isFill);
		}

	@Override
	public void resize(Point1 p) {
		this.p2 = p;	
	}
	@Override
	public void draw(Graphics g) {
		g.drawLine(p1.x,p1.y, p2.x, p2.y);
		
	}
}
