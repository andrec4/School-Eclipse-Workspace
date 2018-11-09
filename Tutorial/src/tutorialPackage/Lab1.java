package tutorialPackage;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Lab1 {

		
	
	public static void main(String[] args) {
	String[] studentsArray = {"brix", "pipoy","boger","thanos","mema","jimbo"};
	int[] gradesArray = new int[studentsArray.length];
	int avg = 0;
	Random r = new Random();

	for (int i = 0; i < gradesArray.length;i++) {
		gradesArray[i] = r.nextInt(101);
		}
	gradesArray[5] = 90;
	for (int i = 0; i < studentsArray.length;i++)	{
		System.out.println("name: " + studentsArray[i] + " grades: " + gradesArray[i]);	
		}

	for (int i = 0; i < studentsArray.length;i++)	{
		avg += gradesArray[i];

	}
	avg = avg/gradesArray.length;
	System.out.println(avg);

	}


}