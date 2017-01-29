import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridWorld {
	public static void main(String[] args) {
		World world = new World();
		Bug lady = new Bug();
		Bug beetle = new Bug();
		Flower flo = new Flower();
		Flower flo2 = new Flower();
		flo.setColor(Color.RED);
		flo2.setColor(Color.WHITE);
		int x = 0;
		int y = 0;
		world.show();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				world.add(new Location(x, y), flo);
				y++;
				world.add(new Location(x, y), flo2);
				y++;
			}
			x++;
			y=0;
			for (int k = 0; k < 5; k++) {
				world.add(new Location(x, y), flo2);
				y++;
				world.add(new Location(x, y), flo);
				y++;
			}
			x++;
			y = 0;
		}
		lady.setColor(Color.RED);
		beetle.setColor(Color.BLUE);
		world.add(new Location(1, 3), lady);
		world.add(new Location(7, 4), beetle);

		beetle.turn();
		beetle.turn();
	}
}
