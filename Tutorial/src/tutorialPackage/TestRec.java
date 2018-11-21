package tutorialPackage;

public class TestRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rec r1 = new Rec(10,10,43,23);
		Rec r2 = new Rec(5,5,5,5);
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		r1.setX(22);
		System.out.println(r1.getX());
		r2.translate(50,  60);
		System.out.println(r2.getX());

	}

}
