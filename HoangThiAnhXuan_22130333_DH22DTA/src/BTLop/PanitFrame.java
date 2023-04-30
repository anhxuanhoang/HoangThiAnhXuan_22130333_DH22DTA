package BTLop;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PanitFrame extends JFrame {
	public PanitFrame() {
		setTitle("SimpleDraws");
		setSize(200,200);
		setResizable(false);
		setVisible(true);
	}
	public void paint (Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.drawLine(20, 50, 250, 50);
		g.setColor(Color.BLUE);
		g.drawRect(30, 70, 60, 60);
		g.setColor(Color.BLUE);
		g.fillRect(100, 70, 60, 60);
		g.setColor(Color.MAGENTA);
		g.drawOval(180, 70, 60, 60);
		g.setColor(Color.MAGENTA);
		g.fillOval(250, 70, 60, 60);
		
		g.setColor(Color.BLUE);
		g.drawRect(30, 170, 60, 60);
		g.setColor(Color.BLUE);
		g.fillRect(100, 170, 60, 60);
		g.setColor(Color.MAGENTA);
		g.fill3DRect(180, ABORT, WIDTH, HEIGHT, rootPaneCheckingEnabled);
	}
	public static void main(String[] args) {
		new PanitFrame();
	}
}
