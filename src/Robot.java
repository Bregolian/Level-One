import javax.swing.JOptionPane;

public class Robot {
int numberOfWheels;
Knife knife;
String name;
boolean isEvil;
public Robot(boolean evil, String n){
	numberOfWheels=6;
	knife=new Knife();
	name=n;
	isEvil=evil;
}
public void borg(){
	if (isEvil==true) {
		JOptionPane.showMessageDialog(null, name+" says resistance is futile.");
	}
}
}
