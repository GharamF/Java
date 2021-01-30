import java.util.ArrayList;


public class Portfolio {
    private ArrayList<Project> projects;
    
    public void addProject(Project project){
		projects.add(project);
	}
    
	public String getPortfolio(){
		return projects.toString();
    }
    public void elevatorPitch(){
        double total = 0;
        for (Project p : projects) {
            total += p.getInitialCost();
            System.out.println(p.elevatorPitch());
        }
    }
}
