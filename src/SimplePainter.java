import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SimplePainter extends JPanel implements MouseListener, KeyListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;
	int size;
	int size2;
	JFrame window;
	Random rand= new Random();
	Color color = new Color(0, 0, 0);
	
	
	ArrayList<Dot> dots = new ArrayList<Dot>();

	public static void main(String[] args) {
		new SimplePainter();
	}

	public SimplePainter() {
		window = new JFrame();
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();

		run();
	}

	private void run(){
		// 1. Make the window respond to mouse clicks
		window.addMouseListener(this);
		// 2. Use the addDot() method to create a new dot at the mouse's x and y
		// position when the mouse is clicked. Call the repaint() method to
		// update the window.
		// 3. Make the window respond to keyboard presses
		window.addKeyListener(this);
		// 4. Use the changeDotColor(Color) method to change the dots color when
		// the number keys are pressed
		// 5. Add a key to make the dot color random

// 6. Implement the MouseMotionListener interface
		// 7. Draw a stream of dots when the mouse is clicked and dragged
		window.addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		for (Dot d : dots) {
			d.draw(g);
		}
	}

	private void addDot(int x, int y) {
		dots.add(new Dot(x - size/2, y - (size2/2)-24, size, size2, color));
	}

	private void changeDotColor(Color c){
		color = c;
	}
	
	private class Dot {
		int x;
		int y;
		int width;
		int height;

		Color c = new Color(0, 0, 0);

		public Dot(int x, int y, int width, int height, Color c) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.c = c;
		}

		public void draw(Graphics g) {
			g.setColor(c);
			g.fillRect(x, y, width, height);
		}

		public void setColor(Color c) {
			this.c = c;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(e.getX(),e.getY());
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()== KeyEvent.VK_0) {
			changeDotColor(Color.BLACK);
		}
		else if (e.getKeyCode()== KeyEvent.VK_1) {
			changeDotColor(Color.BLUE);
		}
		else if (e.getKeyCode()== KeyEvent.VK_2) {
			changeDotColor(Color.GRAY);
		}
		else if (e.getKeyCode()== KeyEvent.VK_3) {
			changeDotColor(Color.GREEN);
		}
		else if (e.getKeyCode()== KeyEvent.VK_4) {
			changeDotColor(Color.ORANGE);
		}
		else if (e.getKeyCode()== KeyEvent.VK_5) {
			changeDotColor(Color.PINK);
		}
		else if (e.getKeyCode()== KeyEvent.VK_6) {
			changeDotColor(Color.RED);
		}
		else if (e.getKeyCode()== KeyEvent.VK_7) {
			changeDotColor(Color.WHITE);
		}
		else if (e.getKeyCode()== KeyEvent.VK_8) {
			changeDotColor(Color.YELLOW);
		}
		else if (e.getKeyCode()== KeyEvent.VK_9) {
			changeDotColor(Color.CYAN);
		}
		else if (e.getKeyCode()== KeyEvent.VK_MINUS) {
			size=Integer.parseInt(JOptionPane.showInputDialog("What would you like your dot height to be?"));
			size2=Integer.parseInt(JOptionPane.showInputDialog("What would you like your dot width to be?"));
		}
		else if (e.getKeyCode()== KeyEvent.VK_SPACE) {
			rand.nextInt(9);
			if (rand.equals(0)) {
				changeDotColor(Color.BLACK);
			}
			else if (rand.equals(1)) {
				changeDotColor(Color.BLUE);
			}
			else if (rand.equals(2)) {
				changeDotColor(Color.GRAY);
			}
			else if (rand.equals(3)) {
				changeDotColor(Color.GREEN);
			}
			else if (rand.equals(4)) {
				changeDotColor(Color.ORANGE);
			}
			else if (rand.equals(5)) {
				changeDotColor(Color.PINK);
			}
			else if (rand.equals(6)) {
				changeDotColor(Color.RED);
			}
			else if (rand.equals(7)) {
				changeDotColor(Color.WHITE);
			}
			else if (rand.equals(8)) {
				changeDotColor(Color.YELLOW);
			}
			else if (rand.equals(9)) {
				changeDotColor(Color.CYAN);
			}
		}
		else {
			changeDotColor(Color.MAGENTA);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(e.getX(),e.getY());
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
