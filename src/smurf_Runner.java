
public class smurf_Runner {
	public static void main(String[] args) {
	Smurf handy=new Smurf("Handy");
	Smurf papa=new Smurf("Papa");
	Smurf ette=new Smurf("Smurfette");
	System.out.println(handy.getName());
	handy.eat();
	System.out.println(papa.getName());
	papa.eat();
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	System.out.println(ette.getName());
	ette.eat();
	System.out.println(ette.getHatColor());
	System.out.println(ette.isGirlOrBoy());
	}
}
