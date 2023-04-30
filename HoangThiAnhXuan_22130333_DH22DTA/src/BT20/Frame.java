package BT20;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;

public class Frame extends JFrame {
	public Frame () {
		setTitle("Simple Paint");
		setSize (400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.gray);
		getContentPane().add(new MainPanel());
	}
	public static void main(String[] args) {
		new Frame();
	}

}
