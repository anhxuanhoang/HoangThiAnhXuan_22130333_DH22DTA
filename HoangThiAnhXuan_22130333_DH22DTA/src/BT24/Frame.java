package BT24;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Frame extends JFrame{
	MyPanel myPanel;
	
	JMenu fileMenu, managementMenu;
	JMenuBar menubar;
	
	public Frame() {
		setSize(800, 600);
		setTitle("Khoa Cong Nghe Thong Tin");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		myPanel = new MyPanel();
		getContentPane().add(myPanel);
		
		setJMenuBar(createMenubar());
		
		setVisible(true);
	}
	private JMenuBar createMenubar() {
		JMenuBar menuBar = new JMenuBar();
		
		//FileMenu
		JMenu fileMenu = new JMenu();
		fileMenu.setFont(new Font(null, 1, 15));
		fileMenu.setMnemonic('F');
		
		JMenuItem exitItem = new JMenuItem("EXIT");
		exitItem.setMnemonic('E');
		exitItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);
		
		//Management Menu
		JMenu managementMenu = new JMenu("Quan ly sinh vien");
		managementMenu.setFont(new Font(null,1,15));
		
	 
		
		return menubar;
	}
	public static void main(String[] args) {
		new Frame();
	}

}
