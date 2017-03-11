import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Reverso implements ActionListener{
	JFrame jFrame=new JFrame();
	JPanel jPanel=new JPanel();
	JTextField jText=new JTextField(10);
	JButton jButton=new JButton();
	String text=new String();
	int length; 
	int length2;
	String newT="";
public static void main(String[] args) {
	Reverso r=new Reverso();
	r.setup();
}
public void setup(){
	jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
	jFrame.setVisible(true);
	jFrame.add(jPanel);
	jFrame.setSize(500,500);
	jPanel.add(jText);
	jText.setEditable(true);
	jPanel.add(jButton);
	jText.setVisible(true);
	jButton.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	text=jText.getText();
	if(e.getSource()==jButton){
		length=text.length();
		length2=length-1;
		for (int i = 0; i < length; i++) {
			newT=newT+text.charAt(length2);
			length2-=1;
		
		}
		jText.setText(newT);
		newT="";
	}
}
}
