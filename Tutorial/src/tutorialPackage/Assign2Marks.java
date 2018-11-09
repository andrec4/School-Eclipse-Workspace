package tutorialPackage;

public class Assign2Marks {

	public static void main(String[] args) {
		//defines variables for names, grade, exam 1 grade, exam 2 grade and exam 3 grade
		String[] names = {"Brix","Zach","Bradley","Angel","Gio","Stefano"};
		int[] gradeNum = {11,11,11,11,11,11};
		int[] exam1 = {100,8,98,70,90,79};
		int[] exam2 = {99,13,99,90,70,60};
		int[] exam3 = {100,0,99,87,95,96};
		
		for (int i = 0; i < names.length;i++)	{//the for loop to print the name, grade and exam individually
			System.out.println("Name: "+names[i]+"\nGrade : "+gradeNum[i]+
					"\nExam 1: "+exam1[i]+"\nExam 2: "+exam2[i]+"\nExam 3: "+exam3[i]+"\n");
			System.out.println("The average of "+names[i]+" is " +((exam1[i]+exam2[i]+exam3[i])/3)+"\n");
		}
		for (int i = 0; i<names.length;i++) {//This prints the name grade and grade on each exam
			System.out.println((i+1)+". "+names[i]+" "+gradeNum[i]+" "+exam1[i]+" "+exam2[i]+" "+exam3[i]);
		}
		System.out.println("\n");
		for	(int i = 0; i < names.length;i++)	{//States what each person got on exam 3
			if (exam3[i] > 79)	{
				System.out.println(names[i]+" got "+exam3[i]+" on Exam 3.");
			}
		}
		for (int i = 0;i<names.length;i++)	{//changes the person who got lower than 50 to 40.
			if (exam1[i]<50)	{
				exam1[i] = 40;
				System.out.println(names[i]+" got lower than 50 on exam 1 so it is changed to "
						+ exam1[i]+".");
			}
		}

	}//end static void

}//end class
