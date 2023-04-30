package BT24;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	JLabel label;
	CardLayout cardlayout;
	
	JPanel cardPanel;
	
	public MyPanel() {
		cardlayout = new CardLayout();
		cardlayout.setLayout(new CardLayout());
		
		setLayout(new BorderLayout());
		
		cardPanel.add("default", new DefaultPanel());
		cardPanel.add("subject", new SubjectPanel());
		cardPanel.add("mark", new MarkPanel());
		
		add(cardPanel, BorderLayout.CENTER);
	}
	public void change(String name) {
		
	}
		
	class DefaultPanel extends JPanel {
		DefaultPanel(){
			setLayout(new BorderLayout());
		label = new JLabel("QUAN LY SINH VIEN KHOA CNTT");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font(null,1,15));
		add(label, BorderLayout.CENTER);
		}
	}
		
}
