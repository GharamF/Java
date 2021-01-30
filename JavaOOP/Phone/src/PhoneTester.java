
public class PhoneTester {

	public static void main(String[] args) {
		Galaxy S9 = new Galaxy("S9",99,"verizon","Ring Ring Ring!");
		IPhone iphone10 = new IPhone("x",100,"AT&T","Zing!");
		
		S9.displayInfo();
		System.out.println(S9.getringTone());
		System.out.println(S9.unlock());
		
		iphone10.displayInfo();
		System.out.println(iphone10.getringTone());
		System.out.println(iphone10.unlock());
	}

}
