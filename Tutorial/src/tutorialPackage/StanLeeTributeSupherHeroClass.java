package tutorialPackage;

public class StanLeeTributeSupherHeroClass {
	//the variables
	private String power;
	private String name;
	private int age;
	private int health;
	private int damage;
	

	public StanLeeTributeSupherHeroClass() {
		//sets the variables for the object
		String power = "none";
		String name = "none";
		int age = 0;
		int hp = 100;
		int dmg = 20;
	}
	//to change the attributes
	public StanLeeTributeSupherHeroClass(String n, String p, int a,int hp, int dmg)	{
		power = p;
		name = n;
		age = a;
		health = hp;
		damage = dmg;
		
		
	}
	
	public int getHP()	{
		return health;
	}
	
	public int getDMG()	{
		return damage;
	}
	
	public void setHP(int hp) {
		health = hp;
	}
	
	public void setPower(String newPower) {
		power = newPower;
		
	}
	
	public String toString() {
		return "Name: "+name+" Power: "+power+" Age: "+age;
	}
	
	public void battle(StanLeeTributeSupherHeroClass h)	{
		h.setHP(h.getHP()-this.getDMG());
	}
	
}
