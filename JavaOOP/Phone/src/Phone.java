public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
   
    
    // getters and setters removed for brevity. Please implement them yourself
    public void setversionNumber(String versionNumber) {
    	this.versionNumber=versionNumber;
    }
    public String getversionNumber() {
    	return versionNumber;
    }
    public void setbatteryPercentage(int batteryPercentage) {
    	this.batteryPercentage=batteryPercentage;
    }
    public int getbatteryPercentage() {
    	return batteryPercentage;
    }
    public void setcarrier(String carrier) {
    	this.carrier=carrier;
    }
    public String getcarrier() {
    	return carrier;
    }
    public void setringTone(String ringTone) {
    	this.ringTone = ringTone;
    } 
    public String getringTone() {
    	return ringTone;
    }
    
    
}
