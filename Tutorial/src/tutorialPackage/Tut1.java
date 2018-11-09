package tutorialPackage;

import java.util.Scanner;

public class Tut1 {

	public static void main(String[] args) {
		String[] employeeName = {"john","jill","george","greg","basil"};
		int[] wage = {15,17,50,29,10};
		
		int[] hours = new int[5];
		
		hours[0] = 34;
		hours[1] = 25;
		hours[2] = 32;
		hours[3] = 11;
		hours[4] = 40;
		
		for (int i = 0;i<wage.length;i++) {//print names and wages
			System.out.println("i: "+i+" Name: "+employeeName[i]+" \twage: $"+wage[i]); 
		}
		System.out.println();
		for (int i = 0;i<wage.length;i++) {//print pay
			System.out.println("Name: "+employeeName[i]+" Pay: "+wage[i]*hours[i]); 
		}
		System.out.println();
		for(int i = 0; i < wage.length; i++)	{//fire unproductive employees
			if (hours[i] < 40) {
				System.out.println("FIRE: "+employeeName[i]);
				employeeName[i] = "";
				wage[i] = 0;
			}
		}

	}

}
