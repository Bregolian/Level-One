import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	static int height;
	static int time;

	public static void main(String[] args) {
		String Times = "1";
		String color = "green";
		String Height = "0";
		Tortoise.setSpeed(10);
		Tortoise.penUp();
		Tortoise.setX(0);
		Tortoise.setY(350);
		Tortoise.penDown();
		Tortoise.turn(90);
		Tortoise.move(40);
		Tortoise.turn(-90);
		Times = JOptionPane.showInputDialog("How many buildings do you want?");
		time = Integer.parseInt(Times);
		String first = ("");
		for (int i = 0; i < time; i++) {
			color = JOptionPane.showInputDialog(
					"What color do you want the" + first + " building out of red, blue, green and black?");
			Height = JOptionPane.showInputDialog("How tall do you want the" + first + " building?");
			if (Height.equalsIgnoreCase("small")) {
				Height = ("60");
				height = 60;
			}
			if (Height.equalsIgnoreCase("medium")) {
				Height = ("120");
				height = 120;
			}
			if (Height.equalsIgnoreCase("large")) {
				Height = ("250");
				height = 250;
			}
			if (color.equalsIgnoreCase("red")) {
				Tortoise.setPenColor(Color.RED);
			}
			if (color.equalsIgnoreCase("blue")) {
				Tortoise.setPenColor(Color.BLUE);
			}
			if (color.equalsIgnoreCase("green")) {
				Tortoise.setPenColor(Color.GREEN);
			}
			if (color.equalsIgnoreCase("black")) {
				Tortoise.setPenColor(Color.BLACK);
			}
			height = Integer.parseInt(Height);

			drawHouse();
			first = ("next");
		}
	}

	static void drawHouse() {

		Tortoise.move(height);
		Tortoise.turn(90);
		Tortoise.move(20);
		Tortoise.turn(90);
		Tortoise.move(height);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(20);
		Tortoise.turn(-90);

	}
}
