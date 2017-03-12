import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ButtonFun implements ActionListener {
	JFrame jFrame=new JFrame();
	JPanel jPanel=new JPanel();
	JTextField jText=new JTextField(10);
	JButton jButton=new JButton();
	JButton jButton2=new JButton();
	String input;
	int nInput;
	int answer;
public static void main(String[] args) {
	ButtonFun b=new ButtonFun();
	b.setup();
}
public void setup(){
	jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
	jFrame.setSize(500, 500);
	jFrame.add(jPanel);
	jPanel.add(jText);
	jPanel.add(jButton);
	jPanel.add(jButton2);
	jFrame.setVisible(true);
	jText.setEditable(true);
	jButton.addActionListener(this);
	jButton2.addActionListener(this);
	jButton.setText("Double");
	jButton2.setText("Square");
}
@Override
public void actionPerformed(ActionEvent e) {
	input=jText.getText();
	nInput=Integer.parseInt(input);
	if(e.getSource()==jButton){
	answer=nInput*2;	
	JOptionPane.showMessageDialog(null, answer);
	}
	else if(e.getSource()==jButton2){
	answer=nInput*nInput;
	JOptionPane.showMessageDialog(null, answer);
	}
}
}
