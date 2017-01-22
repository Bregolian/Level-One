import java.util.Random;

import javax.swing.JOptionPane;

public class Dragon {
	String name;
	int longestBreath;
	String type;
	Random rand = new Random();
	int randInt = rand.nextInt(10);

	public Dragon(String name, String type) {
		this.name = name;
		this.longestBreath = rand.nextInt(4);
		this.type = type;
	}

	public boolean killAKnight() {
		if (longestBreath > randInt) {
			JOptionPane.showMessageDialog(null, name + " succeeded in killing a level " + randInt + " knight.");
			longestBreath++;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, name + " died trying to kill a level " + randInt + " knight.");
			return false;
			
		}
	}

	public static void main(String[] args) {
		Dragon d = new Dragon("Andrew", "Big!");
		d.killAKnight();
	}
}
