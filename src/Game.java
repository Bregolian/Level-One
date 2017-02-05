import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
JFrame jFrame=new JFrame();

JPanel jPanel=new JPanel();
JLabel jLabel=new JLabel();
JButton jButton=new JButton();
public static void main(String[] args) {
	Game g=new Game();
	g.setUp();
}
void setUp(){
	jFrame.setSize(1920, 1080);
	jFrame.setVisible(true);
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jFrame.add(jPanel);
	jPanel.add(jLabel);
	jPanel.add(jButton);
	jButton.setText("Ready Player One");
	jPanel.setLayout(null);
	jButton.setBounds(710, 550, 500, 150);
}
}
