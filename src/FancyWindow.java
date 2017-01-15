import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;

public class FancyWindow implements KeyListener {
	JFrame jFrame = new JFrame();
	boolean visible=true;
	Random randy= new Random();
	Random randy2= new Random();
	public static void main(String[] args) {
		FancyWindow f = new FancyWindow();
		f.buildWindow();
	}

	void buildWindow() {
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(200, 200);
		jFrame.setVisible(visible);
		jFrame.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			jFrame.setSize(randy.nextInt(3000), randy2.nextInt(3000));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
