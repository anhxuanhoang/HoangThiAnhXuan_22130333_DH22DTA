package BTLop;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class PanitPanel extends JPanel {
	Point p;
	public void PaintComponent (Graphics g) {
		setBackground(Color.WHITE);
		super.paintComponent(g);
		if (FrameMain.hinh.equalsIgnoreCase("RECT")){
			g.drawRect(ALLBITS, ABORT, WIDTH, HEIGHT);
		}
	}
	

}
