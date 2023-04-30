package BT21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyPanel extends JPanel {
	public static final int NO_SHAPE = 0;
	public static final int RECTANGLE = 1;
	public static final int OVAL = 2;
	
	JPanel topPanel, leftPanel, CenterPanel, drawPanel;
	JButton clearButt, redButt, blueButt;
	JRadioButton squareRadio, ovalRadio, fillRadio, outlineRadio;
	ButtonGroup shapeGroup, typeGroup;
	
	ArrayList<Point>points;
	
	boolean isFill, started;
	int shape;
	Color color;
	
	public MyPanel() {
		setLayout(new BorderLayout());
		points = new ArrayList<Point>();
		
		color = Color.GRAY;
		shape = RECTANGLE;;
		
		setBackground(Color.YELLOW);
		
		topPanel = new TopPanel();
		leftPanel = new LeftPanel();
		drawPanel = new DrawPanel();
		
		add(topPanel, BorderLayout.NORTH);
		add(leftPanel, BorderLayout.WEST);
		add(drawPanel, BorderLayout.CENTER);
	
	}
	public class TopPanel extends JPanel {
		public TopPanel(){
			setLayout(new FlowLayout());
			setBackground(Color.pink);
			
			generateColorButton();
			generateRadioButton();
			
		}

		private void generateRadioButton() {
			//Shape
			squareRadio = new JRadioButton("Square", true);
			//event listener
			squareRadio.addMouseListener(new MouseAdapter() {
				public void mouseClicked (MouseEvent e) {
					shape = RECTANGLE;
					System.out.println("Square");
				}
			});
			add(squareRadio);
			
			ovalRadio = new JRadioButton("Oval");
			ovalRadio.addMouseListener(new MouseAdapter() {
				public void mouseClicked (MouseEvent e) {
					shape = OVAL;
					System.out.println("Oval");
				}
			});
			add(ovalRadio);
			
			//radio button -> add to button group
			shapeGroup = new ButtonGroup();
			shapeGroup.add(squareRadio);
			shapeGroup.add(ovalRadio);
			
			//type
			fillRadio = new JRadioButton("Fill");
			fillRadio.addMouseListener(new MouseAdapter() {
				public void mouseClicked (MouseEvent e) {
					isFill = true;
					System.out.println("Fill");
				}
			});
			add(fillRadio);
			
			outlineRadio = new JRadioButton("Outline");
			outlineRadio.addMouseListener(new MouseAdapter() {
				public void mouseClicked (MouseEvent e) {
					isFill = false;
					System.out.println("Outline");
				}
			});
			add(outlineRadio);
			
			typeGroup = new ButtonGroup();
			typeGroup.add(fillRadio);;
			typeGroup.add(outlineRadio);
		}

		private void generateColorButton() {
			//red button
			redButt = new JButton("Red");
			redButt.setBackground(Color.RED);
			redButt.addMouseListener(new MouseAdapter() {
				public void mouseClicked (MouseEvent e) {
					color = Color.RED;
				}
			});
			add(redButt);
			
			//blue button
			blueButt = new JButton("Blue");
			blueButt.setBackground(Color.BLUE);
			blueButt.addMouseListener(new MouseAdapter() {
				public void mouseClicked (MouseEvent e) {
					color = Color.BLUE;
				}
			});
			add(blueButt);
		}
	}

//		private void createTypeButton() {
//			fillRadio = new JRadioButton("Fill");
//			fillRadio.setSelected(true);
//			
//			outlineRadio = new JRadioButton();
//			typeGroup = new ButtonGroup();
//			typeGroup.add(fillRadio);
//			typeGroup.add(outlineRadio);
//			
//			this.add(fillRadio);
//			this.add(outlineRadio);
//		}
//
//		private void creatrShapeRadioBurron() {
//			squareRadio = new JRadioButton("Square");
//			squareRadio.setSelected(true);
//			
//			ovalRadio = new JRadioButton("Oval");
//			shapeGroup = new ButtonGroup();
//			
//			shapeGroup.add(squareRadio);
//			shapeGroup.add(ovalRadio);
//			
//			this.add(squareRadio);
//			this.add(ovalRadio);
//		}
//
//		private void createBuutton() {
//			redButt = new JButton("RED");
//			redButt.setBackground(Color.red);
//			redButt.setActionCommand("RED");
//			redButt.addMouseListener(new MouseAdapter() {
//				public void mouseClicked(MouseEvent e) {
//					System.out.println("RED");
//				}
//			});;
//			this.add(redButt);
//			
//			blueButt = new JButton("BLUE");
//			blueButt.setBackground(Color.blue);
//			blueButt.addMouseListener(new MouseAdapter() {
//				
//			});
//			this.add(blueButt);
//		}
//		
//	}
	class LeftPanel extends JPanel {
		public LeftPanel() {
			setLayout(new FlowLayout());
			setBackground(Color.pink);
			
			clearButt = new JButton("Clear all");
			clearButt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					points = new ArrayList<>();
					drawPanel.repaint();
				}
			});
			add(clearButt);
		}
	}
	class DrawPanel extends JPanel{
		public DrawPanel() {
			setBackground(Color.yellow);
			
			addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == MouseEvent.BUTTON1) {
						started = true;
					} else if (e.getButton() == MouseEvent.BUTTON3) {
						started = false;
					}
				}
			});
			addMouseMotionListener(new MouseAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					if (started) {
						points.add(new Point(e.getX(), e.getY(), isFill, color, shape));
						repaint();
					}
				}
			});
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(Point p: points) {
				g.setColor(p.color);
				switch(p.shape) {
				case RECTANGLE:{
					if(p.isFill) {
						g.fillRect(p.x, p.y, 20, 20);
					}
					else {
						g.drawRect(p.x, p.y, 20, 20);
					}
					break;
				}
				case OVAL: {
					if(p.isFill) {
						g.fillOval(p.x, p.y, 20, 20);
					}
					else {
						g.drawOval(p.x, p.y, 20, 20);
					}
					break;
				}
				}
			}
		}
	}
}
