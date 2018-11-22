package tutorialPackage;

public class TestSuphero {

	public static void main(String[] args) {
		StanLeeTributeSupherHeroClass Hero1 = new StanLeeTributeSupherHeroClass("Ignite","HellFlame",16,100,20);
		StanLeeTributeSupherHeroClass Hero2 = new StanLeeTributeSupherHeroClass("Powerboy","Super-Strength",18,100,30);
		StanLeeTributeSupherHeroClass Hero3 = new StanLeeTributeSupherHeroClass("Nimble","Super-Speed",17,100,80);
		Hero1.toString();
		System.out.println(Hero1);
		System.out.println(Hero2);
		System.out.println(Hero3);
		
		Meteorite meteor = new Meteorite();
		meteor.mutate(Hero1);
		while(Hero2.getHP()>=0)	{
			Hero1.battle(Hero2);
			System.out.println("Hero 2 HP :"+Hero2.getHP());
		}

	}

}
