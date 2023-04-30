package BT21;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("UsingMousePaint");
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().add(new MyPanel());
	}
	public static void main(String[] args) {
		new MyFrame();
	}

}
