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

			if (choice == 1) {
				sc.nextLine();
				System.out.println("Enter title");
				allSongs.add(sc.nextLine());
				System.out.println("Enter artist name");
				artists.add(sc.nextLine());
			}
			else if (choice == 2)	{//delete from library
				System.out.println("Emter song number to delete");
				allSongs.remove(sc.nextInt()-1);
				artists.remove(sc.nextInt()-1);
			}
			else if (choice == 3) {
				System.out.println("What song number would you like to add?");
				partyPlayList.add(allSongs.get(sc.nextInt()-1));
				System.out.println(partyPlayList);
			}
			else if (choice == 4) {
				break;
			}
		}
	}//end main

}//end class
