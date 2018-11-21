package tutorialPackage;

public class Meteorite {
	String[] powers = {"Flying","Explosion","Morph"};
	public Meteorite()	{}
	public void mutate(StanLeeTributeSupherHeroClass h) {
		int r = (int)(Math.random()*powers.length);
		String newPower = powers[r];
		h.setPower(newPower);
		System.out.println(h.toString());
	}

}
