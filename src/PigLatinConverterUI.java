import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinConverterUI implements ActionListener {
	PigLatinTranslator pigLatinTranslator=new PigLatinTranslator();
	JFrame jFrame=new JFrame();
	JPanel jPanel=new JPanel();
	JTextField jTextField=new JTextField();
	JTextField jTextField2=new JTextField();
	JButton jButton=new JButton();
public static void main(String[] args) {
	new PigLatinConverterUI();
	
}

public PigLatinConverterUI() {
	
	jFrame.setSize(2000, 100);
	jFrame.setTitle("Pig Latin Converter");
	jButton.setText("Translate");
	jTextField.setColumns(60);
	jTextField2.setColumns(60);
	jFrame.add(jPanel);
	jPanel.add(jTextField);
	jPanel.add(jButton);
	jPanel.add(jTextField2);
	jFrame.setVisible(true);
	jButton.addActionListener(this);
	jTextField2.setEditable(false);
	// TODO Auto-generated constructor stub
}

@Override
public void actionPerformed(ActionEvent e) {
//String Translation=
	jTextField2.setText(pigLatinTranslator.translate(jTextField.getText()));
}	
}
