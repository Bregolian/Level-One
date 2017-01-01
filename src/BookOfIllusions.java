import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {
	JLabel jLabel;
	JLabel jLabel2;
	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame jFrame=new JFrame();
	private void createBook() {
		// 2. make the frame visible
		jFrame.setVisible(true);
		// 3. set the size of the frame
		jFrame.setSize(500, 500);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		
		String boat="boat.jpg";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		
		
		// 7. use the "loadImage..." methods below to initialize your JLabel
		jLabel=loadImageFromComputer(boat);
		
		// 8. add your JLabel to the frame\
		jFrame.add(jLabel);
		// 9. call the pack() method on the frame
		jFrame.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		jFrame.addMouseListener(this);
	}
	int number=0;
	public void mousePressed(MouseEvent e) {
	
		String cat= new String("cat-stairs.jpg");
		number++;
		if (number%2==1) {
			jFrame.remove(jLabel);
			System.out.println("Clicked!");
			jLabel2=loadImageFromComputer(cat);
			jFrame.add(jLabel2);
			jFrame.pack();
		}
		else{
			jFrame.remove(jLabel2);
			System.out.println("Clicked!");
			jFrame.add(jLabel);
			jFrame.pack();
		}
		// 11. Print "clicked!" to the console when the mouse is pressed
		
		// 12. remove everything from the frame that was added earlier
		
		// 13. load a new image like before (this is more than one line of code)
		
		
		
		// 14. pack the frame
		
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}

