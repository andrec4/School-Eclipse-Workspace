package tutorialPackage;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Assign5Translator {
	
	
	
	public static void start()	{
		//The scanner
		Scanner sc = new Scanner(System.in);
		//the arrays for the words
		String[] english = {"car","water","pants","phone","eyes","time","nuts","flag","milk"
				,"ghost","shoes","shoot","make","building","glasses"};
		String[] filipino = {"kotse","tubig","pantalon","telepono","mata","oras","mani","bandila",
				"gatas","mumu","sapatos","baril","gawa","gusali","salamin"};
		System.out.println("Mabuhay kaibigan! Welcome to Filipino-English Translator");
		//loops so that they can translate again
		while (true)	{
			//asks for input
			System.out.println("What would you like to translate?: ");
			String translate = sc.nextLine();
			//splits the words in between the spaces and assigns to a array
			String[] multipleWords = translate.split(" ",filipino.length);
			//this loops translates each word individually
			for	(int i =0;i<multipleWords.length;i++)	{
				//assigns the words in the array to translate every loop and translates it
				translate = multipleWords[i];
				System.out.println(translate);
				//finds the equivalent in the other array because they are hard coded with each other specifically
				for (int u = 0;u<english.length;u++) {
					if (translate.equals(english[u]))	{
						System.out.println("That is "+filipino[u]+" in Tagalog.");
					}
					//to translate from filipino to english
					else if(translate.equals(filipino[u]))	{
						System.out.println("That is "+english[u]+" in English.");
					}
				}//end of nested for
			}//end of for
			//asks if you would like to translate again
			System.out.println("Would you like to translate anything else?");
			String choice = sc.nextLine();
			if (choice.equals("yes"))	{
				
			}
			else if (choice.equals("no")) {
				System.out.println("Alright ingat kaibigan!\n(Take care friend!)");
				break;
			}
			else	{
				System.out.println("That is not a valid option");
			}
		}//end of while
	}//end of start()


	public static void main(String[] args) {
		//starts everything
		start();

	}//end of public static

}//end of class
