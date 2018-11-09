package tutorialPackage;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] monster = {"thanos","vampire","slave","fat kid","god","player"};
		System.out.println("What is player name?: ");
		monster[monster.length-1] = "player: "+input.nextLine();
		
		//create coins array and fill randomly
		int[] coins = new int[monster.length];
		for (int i = 0;i<monster.length;i++)	{
			coins[i] = (int)(Math.random()*8+2);
		}
		String[] ability = new String[monster.length];
		ability[0] = "kill half of anything";
		ability[1] = "suck blood";
		ability[2] = "eats you";			
		ability[3] = "kills anything";
		ability[4] = "destroys";
		ability[5] = "one for all";
		
		for(int i = 0; i < monster.length;i++) {
			System.out.println(monster[i]+" attacks with " + ability[i]
					+ " has " + coins[i] + " gold coins");
		}
		System.out.println();
		
		//randomly assign hp
		int[] hp= new int[monster.length];
		for (int i = 0; i < monster.length;i++)	{
			hp[i] = (int)(Math.random()*15+5);
			System.out.println(monster[i]+ " has " + hp[i] + " HP");
		}
		
		System.out.println("The fat kid ate a teenager, how many coins did he have: ");
		coins[0] += input.nextInt();
		System.out.println(monster[3] + " has " +coins[3]+ " gold coins.");
		
		System.out.println("the " + monster[2] + " gets mutated into what?");
		input.nextLine();//eats up extra return/enter symbol\
		monster[3] = input.nextLine();
		
		System.out.println("new monster: " + monster[3]);
		
		int totalCoins = coins[monster.length-1];//set total to initial value
		int turns = 0;
		
		//fight while player hp>0
		while(hp[monster.length-1]>0)	{
			int randomMonster = (int)(Math.random()*monster.length);//pick random monster
			if (randomMonster != monster.length-1) {//check to make sure not fight self
				int hitChance = (int)(Math.random()*2);
				
				if (hitChance % 2 == 0)	{
					System.out.println("You hit with your " + ability[monster.length-1]
							+ " ability and " + monster[randomMonster] + " drops " 
							+ coins[randomMonster] + " gold coins.");
					totalCoins+=coins[randomMonster];
				}	
				else if(hitChance % 2 == 1)	{
					int randomDmg = (int)(Math.random()*2+1);
					hp[monster.length-1] -= randomDmg;
					System.out.println(monster[randomMonster]+" hit you for "+randomDmg
							+" damage. "+hp[monster.length-1]+" hp remaining");
				}//end else if
				
				turns++;
			}//if
		}//end while
		System.out.println("Omae wa mo shinderu! You are killed with "+totalCoins+" coins and lasted "
				+turns+" turns");
	}//end main

}//end class
