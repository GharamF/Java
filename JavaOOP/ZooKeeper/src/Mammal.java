
public class Mammal {
	protected int energyLevel;
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public void displayEnergy() {
		System.out.println("Energy Level:"+this.energyLevel);
	}
}
