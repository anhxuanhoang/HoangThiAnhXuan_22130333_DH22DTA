package BT20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MainPanel extends JFrame{
	public MainPanel() {
		
	}
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawRect(50, 50, 100, 50);
		
		g.setColor(Color.RED);
		g.fillRect(200, 200, 50, 100);
		
		g.drawOval(200, 50, 300, 100);
		
		g.fillArc(300, 100, 200, 100, 70, 100);
		
		g.drawLine(80, 80, 30, 100);
	}
}