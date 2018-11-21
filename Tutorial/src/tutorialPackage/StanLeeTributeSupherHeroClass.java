package tutorialPackage;

public class StanLeeTributeSupherHeroClass {
	//the variables
	private String power;
	private String name;
	

	public StanLeeTributeSupherHeroClass() {
		//sets the variables for the object
		String power = "none";
		String name = "none";
	}
	//to change the attributes
	public StanLeeTributeSupherHeroClass(String n, String p)	{
		power = p;
		name = n;
	}
	public void setPower(String newPower) {
		power = newPower;
		
	}
	
	public String toString() {
		return "Name: "+name+" Power: "+power;
	}
	
}
