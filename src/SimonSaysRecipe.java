import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;
public class SimonSaysRecipe extends KeyAdapter {
 
 // Complete steps 1 - 7 before you test
 // 1. Make a JFrame variable 
 JFrame frank;
 	HashMap<Integer,String> keyMap = new HashMap<Integer, String>();
 	private int keyIndex;
 	private int tries = 0;
 	private int simonSays = 0;
 	Date timeAtStart;
 	private  void makeAlbum() {
 // 2. add 4 images which match keyboard keys like this: images.put(new Integer(KeyEvent.VK_UP), "image.jpg");
 		keyMap.put(new Integer(KeyEvent.VK_UP), "Up");
 		keyMap.put(new Integer(KeyEvent.VK_LEFT), "Left");
 		keyMap.put(new Integer(KeyEvent.VK_DOWN), "Down");
 		keyMap.put(new Integer(KeyEvent.VK_RIGHT), "Right");
 // 3. Tell the user to "Press the matching key when 'Simon says' otherwise press a different key"
 JOptionPane.showMessageDialog(null, "Press the matching key when 'Simon says' otherwise press a different key.");
 // 4. call the method to show an image
showImage();
 	}
	public void keyPressed(KeyEvent e) {
    	int keyCode = e.getKeyCode();
    	// 16. make a points variable to track the score. tell the user their score at the end.
    	int points;
    	System.out.println("boom");
    	//17. if the keyCode matches the imageIndex and "Simon says..."  increase their score
    	if (simonSays==0 && keyCode==keyIndex) {
			JOptionPane.showMessageDialog(null, "You Win");
		}
    	else if (simonSays==0) {
    		JOptionPane.showMessageDialog(null, "You Lose");
		}
    	else if (simonSays==1 && keyCode==keyIndex) {
    		JOptionPane.showMessageDialog(null, "You Lose");
		}
    	else{
    		JOptionPane.showMessageDialog(null, "You Win");	
    	}
    	//18.   if the keyCode doesn't match the imageIndex and "Simon didn't say..."  increase their score	
    	//19. Use the speak method to tell the user if they were correct or not
    	//13. increment tries by 1
  	
    	//14. if tries is greater than 9 (or however many you want)
    	
    	//15.    	exit the program

    	//11. dispose of the frame
   	
    	//12. call the method to show an image

	}
	private void showImage() {
    	//5. initialize your frame to a new JFrame()
		frank =new JFrame();
    	//6. set the frame to visible
	frank.setVisible(true);
  	 //7. rename to the name of your frame
	//frank.add(getNextRandomImage());
    	// 8. set the size of the frame 
     	//frank.setSize(500, 500);
    	// 9. add a key listener to the frame
     	frank.addKeyListener(this);
   	 //10. Use the speak meth.od to either say "Simon says press this key" or "Press this key"
    	//Hint: use the simonSays int and a random number
     	String talk;
     	Random rand=new Random();
     	simonSays=rand.nextInt(2);
     	if (simonSays==0) {
			talk="Simon says ";		}
     	else{
     		talk=" ";
     	}
     	System.out.println(simonSays);
     	
     	speak(talk+"press the "+getNextRandomKey()+" arrow.");
	}
	private String getNextRandomKey() {
    	this.keyIndex = new Random().nextInt(4) + 37;
    	return keyMap.get(keyIndex);
	}
  void speak(String words) {
  	  try {
  	   Runtime.getRuntime().exec("say " + words).waitFor();
  	  } catch (Exception e) {
  	   e.printStackTrace();
  	  }
   	}
	public static void main(String[] args) throws Exception {
	 new SimonSaysRecipe().makeAlbum();
	}
}

/* 
* 20. add a timer
* ~~~ where the code starts running ~~~
* timeAtStart = new Date();
*
* ~~~ where the code ends ~~~
* Date timeAtEnd = new Date();
* System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
* System.exit(0);
*/

