package BTLop;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.w3c.dom.Text;

public class FrameMain extends JFrame {
	private JPanel panelButton, panelLable;
	PanitPanel panelCenter;
	JLabel label, lableHinh, labelMau;
	JButton buttonRect, buttonOval, buttonRed, buttonBlue;
	static String text = "default";
	static String mau="";
	static String hinh="";
	static Color col;
	static String Coursor = "Coursor";
	
	public FrameMain () {
		setTitle("VeHinh");
		setSize(400, 300);
		
		panelButton = new JPanel();
		panelButton.setLayout(new GridLayout(1, 0));
		lableHinh = new JLabel();
		lableHinh.setText("Chon hinh: ");
		
		buttonRect = new JButton();
		buttonRect.setText("Rect");
		buttonOval = new JButton();
		buttonOval.setText("Oval");
		
		labelMau = new JLabel();
		labelMau.setText("Chon mau: ");
		
		buttonBlue = new JButton();
		buttonBlue.setText("Blue");
		buttonRed = new JButton();
		buttonRed.setText("Red");
		
		panelButton.add(lableHinh);
		panelButton.add(buttonOval);
		panelButton.add(buttonRect);
		panelButton.add(labelMau);
		panelButton.add(buttonRed);
		panelButton.add(buttonBlue);
		
		panelCenter = new PanitPanel();
		
		panelLable = new JPanel();
		label = new JLabel();
		label.setText("Coursor: "+text);
		panelLable.add(label);
		//.setHorizontalTextPosition(JLabel CENTER);
		getContentPane().add(panelButton, BorderLayout.NORTH);
		getContentPane().add(panelCenter, BorderLayout.CENTER);
		getContentPane().add(panelLable, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FrameMain();
	}
	public void actionPerformed (ActionEvent e) {
		JButton ev = (JButton)e.getSource();
		if (ev == buttonBlue) {
			col = Color.BLUE;
			mau = "Xanh";
		}else if (ev == buttonRed) {
			col = Color.RED;
			mau = "Do";
		}else if (ev == buttonOval) {
			hinh = "Oval";
		}else if (ev == buttonRect) {
			hinh = "Rect";
		}
		label.setText(Coursor + hinh + mau);
	}
}
