
public class HumanTest {

	public static void main(String[] args) {
		Wizard jane = new Wizard("jane");
		Ninja sara = new Ninja("sara");
		Samurai john  = new Samurai("John");
		
		
		sara.displayHealth();
		sara.steal(john);
		sara.displayHealth();
		john.deathBlow(sara);
		john.displayHealth();
		sara.displayHealth();
		jane.fireball(john);
		john.displayHealth();

	}

}
