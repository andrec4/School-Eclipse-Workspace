package tutorialPackage;
import java.util.ArrayList;
public class ArrayListTutorial {

	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<Integer>();
		int num;
		//useful methods for ArrayList
		grades.add(76);//adds to ArrayList
		grades.add(86);
		grades.add(1,90);//insert 90 at index 1
		grades.remove(0);//removes first item in ArrayList
		grades.get(0);//return index 0
		num = grades.get(1); //assign value of index 1 to num
		grades.size();//return length of array list
		grades.add(25);
		grades.add(51);
		for (int i = 0; i<grades.size();i++)	{
			System.out.println(grades.get(i));
		}
		for	(int i: grades)	{
			System.out.println(i);
		}

	}

}
