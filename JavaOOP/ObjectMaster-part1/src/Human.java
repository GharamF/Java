
public class Human {
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	
	public Human( int strength, int stealth, int intelligence, int health) {
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
		
	}
	
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	public void attack(Human target) {
		System.out.println(" attacking ");
		target.health -= this.strength;
	}
	public void displayHealth() {
		System.out.println("health: " + this.health);
	}
	
	
}
