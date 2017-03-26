import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Simon {
	JFrame jFrame = new JFrame();
	JPanel jPanel = new JPanel();
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	boolean alive = true;
	int i = 1;
	Random rand = new Random();
	String answer;
	String answer2 = "";
	int k;

	public static void main(String[] args) {
		Simon s = new Simon();
		s.setup();
	}

	private void setup() {
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		jFrame.setSize(180, 90);
		jFrame.add(jPanel);
		jPanel.add(b);
		jPanel.add(b2);
		jPanel.add(b3);
		jPanel.add(b4);
		jFrame.setVisible(true);
		b.setOpaque(true);
		b2.setOpaque(true);
		b3.setOpaque(true);
		b4.setOpaque(true);
		while (alive) {
			answer = "" + rand.nextInt(4);
			answer2 = answer2 + answer;
			for (int j = 0; j < i; j++) {
				k =Character.getNumericValue(answer2.charAt(j));
				System.out.println(k); 
				System.out.println(answer2);
				if (k == 0) {
					b.setBackground(Color.RED);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					b.setBackground(Color.GRAY);
				} else if (k == 1) {
					b2.setBackground(Color.BLUE);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					b.setBackground(Color.GRAY);
				} else if (k == 2) {
					b3.setBackground(Color.GREEN);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					b.setBackground(Color.GRAY);
				} else if (k == 3) {
					b4.setBackground(Color.YELLOW);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					b.setBackground(Color.GRAY);
				}
			}

			i++;
			if (i >= 11) {
				alive = false;
				JOptionPane.showMessageDialog(null, "You Win!");
			}
		}
	}
}
