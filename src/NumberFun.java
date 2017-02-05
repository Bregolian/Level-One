import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NumberFun implements ActionListener{
	JFrame jFrame = new JFrame();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton random = new JButton();
	JLabel jLabel = new JLabel();
	JPanel jPanel = new JPanel();
	Random rGen= new Random();
	int x;
	String s;
	public static void main(String[] args) {
		NumberFun f = new NumberFun();
		f.setUp();
	}

	public void setUp() {
		x =rGen.nextInt(100);
		s=""+x;
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.add(jPanel);
		add.setText("ADD");
		subtract.setText("SUB");
		random.setText("RANDOMIZE");
		jPanel.add(add);
		jPanel.add(random);
		jPanel.add(subtract);
		jPanel.add(jLabel);
		jLabel.setText(s);
		jFrame.setSize(500, 500);
		add.addActionListener(this);
		subtract.addActionListener(this);
		random.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==add){
		x++;
		s=""+x;
		jLabel.setText(s);
		}
		if(e.getSource()==subtract){
			x--;
			s=""+x;
			jLabel.setText(s);
		}
		if(e.getSource()==random){
			x =rGen.nextInt(100);
			s=""+x;
			jLabel.setText(s);
		}
	}
}
