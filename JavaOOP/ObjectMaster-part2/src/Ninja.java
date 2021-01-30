
public class Ninja extends Human {

	public Ninja(String name) {
		super(name);
		this.stealth = 10;
	}
	public void steal(Human target) {
		System.out.println(this.name+" Stole health from  "+target.name);
		target.health -= this.stealth;
		this.health += this.stealth;
	}
	public void runAway( ) {
		System.out.println(this.name+" Run Away ");
		this.health -= 10;
	}
}
