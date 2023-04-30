package BT22;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame1 extends JFrame {
	JMenuBar menubar;
	JMenu fileMenu, shapeMenu, colorMenu;
	JMenuItem exitItem, rectItem, ovalItem, lineItem;
	MyPanel1 mainPanel;
	
	public MyFrame1() {
		mainPanel = new MyPanel1();

		setTitle("Painting");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(mainPanel);
		setLocationRelativeTo(null);

		// MenuBar
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		// fileMenu
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');

		// file menu item
		exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		fileMenu.add(exitItem);

		menubar.add(fileMenu);

		// shapeMenu
		shapeMenu = new JMenu("Shape");
		shapeMenu.setMnemonic('S');

		// initial
		rectItem = new JMenuItem("Rect");
		rectItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.setType(MyPanel1.RECTANGLE);
			}
		});
		ovalItem = new JMenuItem("Oval");
		ovalItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.setType(MyPanel1.OVAL);
			}
		});
		lineItem = new JMenuItem("Line");
		lineItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.setType(MyPanel1.LINE);
			}
		});

		// add shapeMenu
		shapeMenu.add(rectItem);
		shapeMenu.add(ovalItem);
		shapeMenu.add(lineItem);

		menubar.add(shapeMenu);

		// color menu
		colorMenu = new JMenu("Color");
		menubar.add(colorMenu);

		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame1();
	}
}
