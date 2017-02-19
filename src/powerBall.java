import java.util.Random;

import javax.swing.JOptionPane;

public class powerBall {
public static void main(String[] args) {
	Random rand=new Random();
	int times=0;
	int one=Integer.parseInt(JOptionPane.showInputDialog("Give me 1 number between 1-30"));
	int two=Integer.parseInt(JOptionPane.showInputDialog("Give me 1 number between 1-30"));
	int three=Integer.parseInt(JOptionPane.showInputDialog("Give me 1 number between 1-30"));
	int four=Integer.parseInt(JOptionPane.showInputDialog("Give me 1 number between 1-30"));
	int five=Integer.parseInt(JOptionPane.showInputDialog("Give me 1 number between 1-30"));
	int six=Integer.parseInt(JOptionPane.showInputDialog("Give me 1 number between 1-30"));
	for (int i = 0; i < 1;) {
		int one2=rand.nextInt(30)+1;
		int two2=rand.nextInt(30)+1;
		int three2=rand.nextInt(30)+1;
		int four2=rand.nextInt(30)+1;
		int five2=rand.nextInt(30)+1;
		int six2=rand.nextInt(30)+1;
		times++;
		if (one==one2&&two==two2&&three==three2&&four==four2&&five==five2&&six==six2) {
			i+=2;
			JOptionPane.showMessageDialog(null, times);
		}
	}
}
}
