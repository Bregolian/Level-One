public class Wizard {

	private boolean cloakOn;
	
	Wizard() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		Wizard Harry=new Wizard();
		// 2. become invisible
		
		Harry.makeInvisible(true);
		Harry.spyOnSnape();
		Harry.makeInvisible(false);
		Harry.castSpell("Stupefy!");
		// 3. spy on professor snape
		// 4. become visible again
		// 5. cast a “stupefy” spell
	}

}

