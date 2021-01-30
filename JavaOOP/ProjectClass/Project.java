class Project {
    private String name;
    private String description;
    private double initialCost ;


    //Overload the constructor method in three different ways.
    public Project() {
        this(" "," ", 0.99);
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost=initialCost;
    }

    //Create getter and setters for each field

	public void setName(String name){ this.name = name; }
    public String getName(){ return this.name; }

	public void setDescription(String description){this.description = description;}
    public String getDescription(){ return this.description;    }

    public double getInitialCost(){return this.initialCost;}
    public void setInitialCost(double initialCost){this.initialCost = initialCost;}



    public String elevatorPitch() {
        return name + " ("+initialCost+"): " + description;
    }
}