import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class CowTimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction.
	 * Work in seconds when testing, then change to minutes
	 */
	static String animal;
	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
		CowTimer Billy= new CowTimer();
		String wait=JOptionPane.showInputDialog("How long would you like the timer?");
		animal=JOptionPane.showInputDialog("What sound do you want an oink, a moo or a baaa?");
		
		int Wait=Integer.parseInt(wait);
		Billy.setTime(Wait);
		Billy.start();
	}

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60
		 * seconds using Thread.sleep(int milliseconds).
		 */
		
		for (int i = 0; i < minutes; i++) {
		JOptionPane.showMessageDialog( null, minutes);
		Thread.sleep(60000);
		}
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to walk.
		 */
		if (animal.equalsIgnoreCase("moo")) {
		playSound("Moo.wav");
		}
		else if (animal.equalsIgnoreCase("oink")) {
			playSound("oink.wav");
			}
		else if (animal.equalsIgnoreCase("baaa")) {
			playSound("baaa.wav");
			}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}




}
