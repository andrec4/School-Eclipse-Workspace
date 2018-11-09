package tutorialPackage;

public class Lab2 {

	public static void main(String[] args) {
		String heroNames[] = {"Angel","BrixBoy","RadBrad","Air-On","Gio-D","VictorY","Steffan","Mailer","Zandex","Cam","Zahc"};	//hero names
		String powers[] = {"Wings","Harden","Strong","Giant","Genius","Hacking","Flying","Speed","Phase","Mech","Sword"};//powers
		boolean isHuman[] = {false,true,true,false,true,true,false,true,true,true,true};//are they human
		System.out.println(heroNames[0]);//prints the 1st superhero name
		System.out.println(heroNames[heroNames.length-1]);//prints the last hero name
		System.out.println("\tName\t\tPower\t\tAre they human?\n");//prints the name power and is human
		for (int i = 0; i < heroNames.length;i++)	{//checks if human and if not changes to NONE
			if	(isHuman[i] == false)	{
				powers[i] = "NONE";
			}
			//prints each hero name power and if they are human
			System.out.println(i+"\t"+heroNames[i]+"\t\t"+powers[i]+"\t\t"+isHuman[i]);
		}

	}

}
