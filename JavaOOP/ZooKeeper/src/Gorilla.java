
public class Gorilla extends Mammal{
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}

	public void eatBananas() {
		System.out.println(" gorilla's satisfaction is increase");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("the gorilla has climbed a tree ");
		this.energyLevel -= 10;
	}
	
	public void throwThings() {
		System.out.println("the gorilla has thrown something");
		this.energyLevel -= 5;
	}
}
 