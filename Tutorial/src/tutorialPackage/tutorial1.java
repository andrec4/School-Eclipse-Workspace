package tutorialPackage;
import java.util.Scanner;
import java.util.Date;

public class tutorial1 {
	public static void main(String[] args)	{
		//arrays with variables for name, amount raised and if they have the form
		String[] names = {"Zach","Paul","Calvin","Rej","Justin","Matt","Jim","Brix","Erwinn","Bobert"};

		double[] amtRaised = {50,103,205,143,234,324,123,167,124,321};
		boolean[] hasForm = {true,false,false,false,true,true,true,false,false,true};
		for	(int i = 0;i<names.length;i++)	{
			System.out.println(names[i]+" "+amtRaised[i]+" "+
		hasForm[i]);
		}//end for
		//this is for the total amount raised
		double totalRaised = 0;
		for	(int i = 0;i<amtRaised.length;i++)	{
			totalRaised+=amtRaised[i];
			
		}
		//Prints the amount raised
		System.out.println("Total Raised: "+totalRaised);
		System.out.println("Avg Raised: "+totalRaised/names.length);
		
		//adds the amount of people who raised over 200
		int over200Cnt = 0;
		for(int i = 0;i<names.length;i++) {
			if (amtRaised[i]>200)	{
				over200Cnt++;
			}
		}
		//prints the people who raised over 200
		System.out.println("The number of people raised over 200: "+over200Cnt);
		//stores the amount of people who have no forms
		int noFormsCnt	=	0;
		for(int i = 0;i<hasForm.length;i++)	{
			if (hasForm[i]==false)	{
				noFormsCnt++;
			}
		}
		//prints the amount of people with no forms
		System.out.println("Number of people with no forms: "+noFormsCnt);
		
		//prints the person who raised the lowest amount
		int lowestIndex = 0;
		for(int i = 0;i<amtRaised.length;i++)	{
			if (amtRaised[lowestIndex]<amtRaised[i])	{
				lowestIndex = i;
			}
		}
		System.out.println("Lowest amount raised: "+amtRaised[lowestIndex]);
	}//end main
}//end class