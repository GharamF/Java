
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class BankAccount {
	protected String AccountNum ;
	protected double checking ;
	protected double savings;
	static int NumOfAccount;
	static double TotalMoney = 0;

	static ArrayList<BankAccount> AccountList = new ArrayList<BankAccount>();

	
	
	public BankAccount(double checking ,double savings) {
		AccountNum =RandomAcctNum();
		this.checking =checking;
		this.savings = savings;
		NumOfAccount++;
		AccountList.add(this);
	}
	
	private String RandomAcctNum() {
		String RandomNumber = "";
		for(int i=0; i<10; i++) {
			RandomNumber += ThreadLocalRandom.current().nextInt(0,  9);
		}
		return RandomNumber;
	}
	
	public double getchecking() {
		return this.checking;
	}
	public double getSaving() {
		return this.savings;
	}
	
	
	public void deposit(double amount , String balance) {
		if (balance =="saving" ) {
			this.savings += amount;
			System.out.print("Saving balance "+this.savings);
		}
		else if (balance=="checking") {
			this.checking += amount; 
			System.out.println("Checking balance "+this.checking);
		}
	}
	public void withdraw(double amount) {
		if (this.checking <amount) {
			System.out.println("Insufficient funds");
		}
		else {
			this.checking -=amount;
			System.out.println("Withdraw"+amount+"from checking account. New balance:"+this.checking );
		}
	}
	public static void totalAmts() {
		double totalChecking = 0;
		double totalSavings = 0;
		for (BankAccount ba: AccountList) {
			totalChecking += ba.checking;
			totalSavings += ba.savings;
		}
		System.out.println("Total of all checking accounts: $" + totalChecking);
		System.out.println("Total of all savings accounts: $" + totalSavings);
	}
	

	
}
