package tutorialPackage;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListiPod {

	public static void main(String[] args) {
		//Step 1
		ArrayList<String> allSongs = new ArrayList<String>();
		ArrayList<String> artists = new ArrayList<String>();
		
		//Step 2
		allSongs.add("Call Me Maybe");
		artists.add("Carly Rae Jepsen");
		allSongs.add("Lucid Dreams");
		artists.add("Juice WRLD");
		allSongs.add("Happier");
		artists.add("Marshmellow");
		allSongs.add("Gangnam Style");
		artists.add("PSY");
		allSongs.add("Im Your Man");
		artists.add("Ryan Laird");
		
		ArrayList<String> partyPlayList = new ArrayList<String>();
		
		for(int i = 0; i < allSongs.size(); i++)	{
			System.out.println(i+1 + ". "+ allSongs.get(i) + " - "
					+ artists.get(i));
		}//end for
		while (true) {
			System.out.println("\nSelect menu option:\n1. "
					+ "Add song to library"
					+ "\n2. Delete song from library"
					+ "\n3. Add songs to party playlist"
					+ "\n4. Stop");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch (choice)	{
			case 1:
				sc.nextLine();
				System.out.println("Enter title");
				allSongs.add(sc.nextLine());
				System.out.println("Enter artist name");
				artists.add(sc.nextLine());
				break;
			case 2:
				System.out.println("Enter song number to delete");
				int delete = sc.nextInt();
				sc.nextLine();
				allSongs.remove(delete);
				artists.remove(delete);
				break;
			case 3:
				System.out.println("What song number would you like to add?");
				partyPlayList.add(allSongs.get(sc.nextInt()-1));
				System.out.println(partyPlayList);
				break;
			case 4:
				System.out.println("Cya!");
				break;
			default :
				System.out.println("Invalid choice");
				break;
			}

			
			
		}
	}//end main

}//end class
