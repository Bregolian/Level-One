import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
	JFrame jFrame=new JFrame();
	JPanel jPanel=new JPanel();
	JButton jButton=new JButton();
	JButton jButton2=new JButton();
public static void main(String[] args) {
	chuckleClicker c=new chuckleClicker();
	c.setup();
	
}
public void setup(){
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jButton.setText("Joke");
	jButton2.setText("Punchline");
	jFrame.add(jPanel);
	jPanel.add(jButton);
	jPanel.add(jButton2);
	jFrame.setSize(500, 75);
	jFrame.setVisible(true);
	jButton.addActionListener(this);
	jButton2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==jButton){
		JOptionPane.showMessageDialog(null, "Why didn't the skeleton cross the road?");
	}
	if(e.getSource()==jButton2){
		JOptionPane.showMessageDialog(null, "Because he didn't have the guts.");
	}
	
}

}
