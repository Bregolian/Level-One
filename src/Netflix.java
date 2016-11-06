
public class Netflix {

	public static void main(String[] args) {
		Movie ForceAwakens =new Movie("The Force Awakens",4);
		Movie DrStrange =new Movie("Doctor Strange",5);
		Movie Zootopia =new Movie("Zootopia",5);
		Movie AvsP =new Movie("Alien vs. Predator",2);
		Movie HarryPotter =new Movie("Harry Potter and the Sorcerer's Stone",4);
		DrStrange.getTicketPrice();
		NetflixQueue Favorites=new NetflixQueue();
		Favorites.addMovie(DrStrange);
		Favorites.addMovie(Zootopia);
		Favorites.addMovie(HarryPotter);
		Favorites.printMovies();
		Favorites.sortMoviesByRating();
		System.out.println(Favorites.getBestMovie());
		System.out.println(Favorites.getMovie(1));
	}

}
