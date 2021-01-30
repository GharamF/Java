
public class HumanTest {

	public static void main(String[] args) {
		Human jane = new Human();
		Human sara = new Human();
		jane.displayHealth();
		sara.attack(jane);
		
		jane.displayHealth();
		sara.displayHealth();

	}

}
