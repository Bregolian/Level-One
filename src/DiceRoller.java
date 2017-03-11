import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DiceRoller implements ActionListener {
	JFrame jFrame=new JFrame();
	JPanel jPanel=new JPanel();
	JButton jButton=new JButton();
	Random randy=new Random();
	int num;
public static void main(String[] args) {
	DiceRoller d=new DiceRoller();
	d.setup();
}
public void setup(){
	jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
	jFrame.setSize(500, 500);
	jFrame.add(jPanel);
	jPanel.add(jButton);
	jButton.addActionListener(this);
	jFrame.setVisible(true);
	jFrame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	int num= randy.nextInt(6)+1;
	JOptionPane.showMessageDialog(null, num);
	
}
}
