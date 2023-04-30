package BT22;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	Point1 p1, p2;
	Color color;
	int type;
	boolean isFill;

	public Shape(Point1 p1, Color color, int type, boolean isFill) {
		super();
		this.p1 = p1;
		this.color = color;
		this.type = type;
		this.isFill = isFill;
	}
	public abstract void resize (Point1 p);
	public abstract void draw (Graphics g);
		
	}

