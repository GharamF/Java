public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    	return this.getringTone();
    }
    @Override
    public String unlock() {
        // your code here
    	return "unlocked via finger print";
    }
    @Override
    public void displayInfo() {
    	System.out.println("Galaxy "+this.getversionNumber()+" from "+this.getcarrier());         
    	   
    }
}
