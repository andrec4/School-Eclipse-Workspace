package tutorialPackage;

public class TestSuphero {

	public static void main(String[] args) {
		StanLeeTributeSupherHeroClass Hero1 = new StanLeeTributeSupherHeroClass("Ignite","HellFlame");
		StanLeeTributeSupherHeroClass Hero2 = new StanLeeTributeSupherHeroClass("Powerboy","Super-Strength");
		StanLeeTributeSupherHeroClass Hero3 = new StanLeeTributeSupherHeroClass("Nimble","Super-Speed");
		Hero1.toString();
		System.out.println(Hero1);
		System.out.println(Hero2);
		System.out.println(Hero3);
		
		Meteorite meteor = new Meteorite();
		meteor.mutate(Hero1);

	}

}
