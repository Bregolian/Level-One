import java.util.Random;

import javax.swing.JOptionPane;

public class mathExperiment {
	public static void main(String[] args) {
		int per;
		int guy;
		int sir=0;
		//per=Integer.parseInt(JOptionPane.showInputDialog("What's a number between 1 and 100?"));
		Random rand=new Random();
		for (int i = 0; i < 1000000; i++) {
			guy=rand.nextInt(100);
			per=rand.nextInt(100);
			if (guy==per) {
				sir++;
			}
		}
		JOptionPane.showMessageDialog(null, sir);
	}
}
