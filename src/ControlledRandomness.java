import java.util.Random;

import javax.swing.JOptionPane;

public class ControlledRandomness {
	Random rand=new Random();
	long one;
	long two;
	String answer;
	int answer2;
public static void main(String[] args) {
	ControlledRandomness c=new ControlledRandomness();
	c.setup();
}
private void setup() {
	answer=JOptionPane.showInputDialog("How many rows would you like?");
	answer2=Integer.parseInt(answer);
	one= rand.nextInt(10);
	System.out.println(one);
	two=one*10;
	for (int i = 0; i < answer2-1; i++) {
		one= rand.nextInt(10);
		two=two+one;
		System.out.println(two);
		two=two*10;
	}
	
		
}
}
