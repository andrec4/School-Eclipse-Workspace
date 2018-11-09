package tutorialPackage;
import  java.util.Random;
import java.util.Scanner;
public class guessGame {

	public static void startUp() {
		Scanner scStr = new Scanner( System.in ); 
		Scanner scNum = new Scanner( System.in ); 
		System.out.println("Welcome to the guessing game!");
		System.out.println("Who is our lucky guess today?!");
		System.out.println("\nEnter your name: ");
		String name = scStr.nextLine();
	}

	public static void main(String[] args) {
		int s = 1;
		for (int j = 3; j >= 0; j--)
		{
		s = s + j;
		}
		System.out.println(s);
	}

}