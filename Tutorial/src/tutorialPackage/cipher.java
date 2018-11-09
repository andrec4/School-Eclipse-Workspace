package tutorialPackage;
import java.util.Scanner;

public class cipher {
	//The method for encrypting
	public static String encrypt(String text, int shiftValue)	{
		int shift = shiftValue;//the amount to shift by
		String name = text.toLowerCase();//makes name lower case
		String encryptedName = "";//the variable for the new name
		int objectLength = name.length();//Assigns this variable to the length of the name
		for (int x = 0; x < objectLength; x++)	{//Sets for loop length to how long it is
			if (Character.isLetter(name.charAt(x)))	{//Determines if the character is a letter
				if (name.charAt(x)+shift > 122)	{//Determines if the character ascii is more than 122
					char newCharacter = (char)(((name.charAt(x)+shift)%122)+96);//The equation to make the char number more than 122 go back to 96
					encryptedName += newCharacter;//Adds new character to the empty variable
				}
				else	{//This is numbers that are within 96 and 122
				char newCharacter = (char)(name.charAt(x)+shift);//Adds the key to char
				encryptedName += newCharacter;//Adds to the empty variable
				}
			}
			else	{//adds the spaces to the empty variable
				encryptedName+=name.charAt(x);
			}
		}
		return encryptedName;
	}

	public static String decrypt(String text, int shiftValue)	{
		int shift = shiftValue;//the amount to shift by
		String name = text.toLowerCase();//makes name lower case
		String decryptedName = "";//the variable for the new name
		int objectLength = name.length();//Assigns this variable to the length of the name
		for (int x = 0; x < objectLength; x++)	{//Sets for loop length to how long it is
			if (Character.isLetter(name.charAt(x)))	{////Determines if the character is a letter
				if (name.charAt(x)-shift < 97)	{//Determines if the character ascii is less than 97
					char newCharacter = (char)(((name.charAt(x)-shift)-96)+122);//The equation to make the char number that is less than 96 to add to 96
					decryptedName += newCharacter;
				}
				else	{
				char newCharacter = (char)(name.charAt(x)-shift);
				decryptedName += newCharacter;
				}
			}
			else	{
				decryptedName+=name.charAt(x);
			}
		}
		return decryptedName;
	}
	
	public static void start()	{
		Scanner sc = new Scanner(System.in);
		while (true)	{
			System.out.println("Would you like to encrypt or decrypt?\nKey is 5.\n1. Encrypt\n2. Decrypt");
			int choice1 = sc.nextInt();
			sc.nextLine();
			if (choice1 == 1) {
				System.out.println("What would you like to encrypt?");
				String encrypt = sc.nextLine();
				System.out.println(encrypt(encrypt, 5));
				System.out.println("Would you like to do anything else?\nKey is 5.\n1. Yes\n2. No");
				int choice2 = sc.nextInt();
				sc.nextLine();
				if (choice2 == 1) {
					
				}
				else if (choice2 == 2)	{
					break;
				}
			}
			else if (choice1 == 2)	{
				System.out.println("What would you like to decrypt? ");
				String decrypt = sc.nextLine();
				System.out.println(decrypt(decrypt, 5));
				System.out.println("Would you like to do anything else?\n1. Yes\n2. No");
				int choice2 = sc.nextInt();
				sc.nextLine();
				if (choice2 == 1) {
					
				}
				else if (choice2 == 2)	{
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		start();
	}
}
