public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    	return this.getringTone();
    }
    @Override
    public String unlock() {
    	return "unlocked via facial recognition";
    }
    @Override
    public void displayInfo() {
        System.out.println("IPhone "+this.getversionNumber()+" from "+this.getcarrier());         
    }
}
