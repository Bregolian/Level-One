import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class rollDice implements ActionListener {
	JFrame jFrame=new JFrame();
	JPanel jPanel=new JPanel();
	JButton jButton=new JButton();
	Random randy=new Random();
	public static void main(String[] args) {
	rollDice c=new rollDice();
	c.setup();
	}
	public void setup(){
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jButton.setText("Roll Dice");
	jFrame.add(jPanel);
	jPanel.add(jButton);
	jFrame.setSize(100, 75);
	jFrame.setVisible(true);
	jButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jButton) {
			String die= JOptionPane.showInputDialog("How many sided die would you like to roll?");
			int dieInt= Integer.parseInt(die);
			int num= randy.nextInt(dieInt)+1;
			JOptionPane.showMessageDialog(null, num);
		}
		
	}

}
