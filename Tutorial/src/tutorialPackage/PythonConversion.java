package tutorialPackage;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class PythonConversion {


static ArrayList<String> backpack = new ArrayList<String>();
static int UserHP = 50;
static Random rand = new Random();
static Scanner sc = new Scanner(System.in);
//sets UserHP to 50
//makes a backpack which will be filled with items during gameplay

public static void YourRoom() {
 
//creates YourRoom with no arguments  
  System.out.println("Your name is Rebly.");
  //prints Your name is Rebly
  //Thread.sleep(4);
  //Thread.sleeps the program for 4 seconds
  System.out.println("Rebly wakes up in their room.");
  //prints UserName <- Choice of user + "wakes up in their room"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("You wake up with only underwear on.");
  //prints "You wake up with only underwear on."
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("You hear glass breaking outside.");
  //prints "You hear glass breaking outside"
  //Thread.sleep(3); 
  //Thread.sleeps the program for 3 seconds
  System.out.println("You look out the window and zombies are overrunning the place.");
  //prints "You look out the window and zombie are overrunning the place."
  //Thread.sleep(4);
  //Thread.sleeps the program for 4 seconds
  System.out.println("You know you have to make quick decisions.");
  //prints "You know you have to make quick decisions."
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("Your options are\n"
  +"1: Jump out the Window(Potential Danger)\n"
  +"2: Walk out of the Room(Potential Danger)");
  //prints "Your options are
  //1: Jump out the Window(Potential Danger)
  //2: Walk out of the Room(Potential Danger)
  int choice = sc.nextInt();
  sc.nextLine();
  System.out.println("Enter a Number for your Choice, Remember Both have potential Danger");
		  
  //makes the variable choice and prints "Enter a number for your Choice, Remember both have potential Danger"
  if (choice == 1)	{
  //if the choice == 1 continues  
    window1();
    //continues through window01
  }
  else if (choice == 2)	{
  //if the choice is 2 continues
    door1();
    //continues through door01
  }
  else	{
  //if the anwser is different than 1 or 2 continue
    System.out.println("Invalid choice, Try again");
    //prints Invalid choice, Try again
    YourRoom();
  }
}

public static void window1()	{
//public static voidines window01 with no arguments
    System.out.println("You die from the fall. Bad choice");
    //prints You die from the fall. Bad choice
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    YourRoom();
    //calls YourRoom so it goes back to the beginning
}

public static void door1()	{
//public static voidines door1 with no arguments 
  System.out.println("You end up in your kitchen.");
  //prints You end up in your kitchen
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("You hear a noise coming from the basement");
  //prints You head a noise coming from the basement
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("Go to see what caused the noise? or Stay?");
  //prints "Go to see what caused the noise? or Stay?"
  System.out.println("Choose 1 to Go, Choose 2 to Stay");
  int choice = sc.nextInt();
  sc.nextLine();
  
  //makes the variable choice and says "Go see what cause the noise? Or Stay?"
  if (choice == 1)	{
  //if the userchoice is equal to "Go" continue
    basement1();
    //calls basement1()
  }
  else if (choice == 2)	{
  //else if the choice is equal to "Stay" continue
    kitchen1();
    //calls kitchen1()
  }
  else	{ 
  //if the anwser is something either than "Go" or "Stay" continue
    System.out.println("Invalid choice, Try again");
    //prints "Invalid choice, Try again"
    door1();
    //calls door1()
  }
}

public static void basement1()	{
//public static voidines basement1 with nho arguments
  System.out.println("You enter the Basement");
  //prints "You enter the Basement"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("False alarm, It was just a box");
  //prints "False alarm, It was just a box"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("There is however clothes for you to take");
  //prints There is however clothes for you to take
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("Would you like to take these clothes?");
  //prints Would you like to take these clothes?
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("Say 1 to take clothes. Say 2 to leave them");
  int choice = sc.nextInt();
  sc.nextLine();
  //makes the choice variable and Prints "Say yes to take clothes. Say no to leave them"
  if (choice == 1 && backpack.contains("Clothes"))	{
  //if the user choice equals to Yes and clothes are not in the variable Backpack continue  
    if (backpack.contains("Clothes")) {
    //if Clothes are in Backpack continue  
    System.out.println("You already have clothes. Why would you need more?");
      //prints "You already have clothes. Why would you need more?"
    }
    if (backpack.contains("Clothes"))	{
    //if Clothes are not in Backpack continue
      backpack.add("Clothes");
      //goes to Backpack and adds the Item "Clothes to it"
    }
  }
  else if (choice == 2)	{
  //if the user choice is equal to No continue  
    System.out.println("Thats alright, I also like being without clothes");
    //prints Thats alright, I also like being without clothes
  }
  else	{
  //if anything other than 'No' or 'no' or 'Yes' or 'yes' continue
    System.out.println("I don't think you understood the question");
    //prints "I don't think you understood the question"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    basement1();
    //calls the function basement1() to go to it
  }
  
  System.out.println("You suddenly remember your dad had a safe with guns.");
  //prints You suddenly remember your dad had a safe with guns.
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("There is however an alarm on the door to the room");
  //prints There is however an alarm on the door to the room
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("You do not know what the passcode to turn off the alarm is.");
  //prints "You do not know what the passcode to turn off the alarm is."
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds 
  System.out.println("Your choices are"
  +"1. Continue Through the door anyways."
  +"2. Go back to the kitchen");
  //prints Your choices are
  //1. Continue Through the door anyways.
  //2. Go back to the kitchen
  System.out.println("Say 1 to Continue, or Say 2 to go Back");
  choice = sc.nextInt();
  sc.nextLine();
  
  //creates the variable choice and prints "Say 1 to Continue, or Say 2 to go Back"
  if (choice == 1)	{
  //if the choice is equal to 1 continue 
    System.out.println("Might as well go since we're down here.");
    //prints "Might as well go since we're down here."
    gunroom();
    //calls gunroom() to go there
  }
  else if (choice == 2)	{
  //else if the choice is equal to 2 continue  
    System.out.println("I'm not going to take that chance, it might be too loud.");
    //prints "I'm not going to take that chance, it might be too loud."
    kitchen1();
    //calls kitchen1() to go to that function
  }
  else	{
  //if the choice is anything other than 1 or 2 continue  
    System.out.println("Invalid choice, maybe you didn't understand?");
    //prints "Invalid choice, maybe you didn't understand?"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    basement1();
    //calls the basement1() function to go there
  }
}
  
public static void kitchen1()	{
//public static voidines Kitchen1 with no arguments
  System.out.println("You return to the kitchen.");
  //prints You return to the kitchen
  //Thread.sleep(2);
  //Thread.sleeps the program for 2 seconds
  System.out.println("You have to make a choice whether to leave the house and find people, or stay and make a hideout?");
  //prints "You have to make a choice whether to leave the house and find people, or stay and make a hideout?"
  System.out.println("Enter 1 to leave, or Enter 2 to Stay");
  int choice = sc.nextInt();
  sc.nextLine();
  //creates the variable choice and prints "Enter Leave to leave, or Enter Stay to Stay"
  if (choice == 1)	{
  //if the user choice is equal to 'Leave' or 'leave' continue
    System.out.println("You leave the house to try and find people");
    //prints "You leave the house to try and find people"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("The moment you leave the house you see people");
    //prints "The moment you leave the house you see people"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("The people you have found are your family members.");
    //prints "The people you have found are your family members."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    Endgame();
    //calls the function Endgame() to continue to it
  }
  else if (choice == 2)	{
  //else if the user choice = 'Stay' or 'stay' continue
    System.out.println("Ok, well if we're going to stay we might as well secure this place.");
    //prints "Ok, well if we're going to stay we might as well secure this place."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("There's a couple of things that you could take apart.");
    //prints "There's a couple of things that you could take apart."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("Would you like to take apart the chair's, the table's, or the cabinet's?");
    //prints "Would you like to take apart the chair's, the table's, or the cabinet's?"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("There are 3 chair's and each chair gives 4 wood");
    //prints "There are 3 chair's and each chair gives 4 wood"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("There is 1 table and it gives 10 wood");
    //prints "There is 1 table and it gives 10 wood"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("There are 7 cabinets which give 3 wood each.");
    //prints "There are 7 cabinets which give 3 wood each."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("You require 21 wood to complete the house, you only have enough energy to take apart 1 item.");
    //prints "You require 21 wood to complete the house, you only have enough energy to take apart 1 item."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("Enter 1 for chair's, 2 for table's, 3 for Cabinets");
    choice = sc.nextInt();
    sc.nextLine();
    //creates the variable choice and prints "Enter Ch for chair's, T for table's, C for Cabinets"
    if (choice == 1)	{
    //if the user choice equals to 1 continue
      System.out.println("Calculating...");
      //prints "Calculating..."
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds 
      System.out.println("...........");
      //pritns ...........
      //Thread.sleep(2);
      //Thread.sleeps the frogram for 2 seconds
      System.out.println("I think you might need to practice your math a bit.");
      //prints "I think you might need to practice your math a bit."
      kitchen1();
      //calls the function kitchen1() to go back to it
    }
    else if (choice == 2)	{
    //else if the chocie is equal to 2 continue
      System.out.println("Calculating...");
      //prints "Calculating..."
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      System.out.println("...........");
      //prints "..........."
      //Thread.sleep(2);
      System.out.println("If only there was another table than you would be good.");
      //prints "If only there was another table than you would be good."
      //Thread.sleep(3);
      //Thread.sleeps the program for 3 seconds
      System.out.println("But sadly I think your math is a bit off");
      //prints "But sadly I think your math is a bit off"
      kitchen1();
      //call the function kitchen1() to go back to it
    }
    else if (choice == 3)	{
    //else if the choice is equal to 3 continue
      System.out.println("Calculating...");
      //prints "Calculating..."
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      System.out.println("..........");
      //prints ".........."
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      System.out.println("Well done sir! Your math is on point!");
      //prints "Well don sir! Your math is on point!"
      //Thread.sleep(3);
      //Thread.sleeps the program for 3 seconds
      System.out.println("Wow, that was some hard work.");
      //prints "Wow, that was some hard work."
      //Thread.sleep(3);
      //Thread.sleeps the program for 3 seconds
      System.out.println("I think you deserve some well rest, you'll continue tomorrow.");
      //prints "I think you deserve some well rest, you'll continue tomorrow."
      //Thread.sleep(4);
      //Thread.sleeps the program for 4 seconds
      wakeup();
      //calls the function wakeup() to go to it
    }
    else	{
    //if anything else is written than 1, 2 or 3 continue
      System.out.println("I don't think you know your numbers.");
      //prints "I don't think you know your numbers."
      //Thread.sleep(3);
      //Thread.sleeps the program for 3 seconds
      System.out.println("Try again");
      //prints "Try again"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      kitchen1();
      //calls the function kitchen1() to go back to it
    }
  }
  else	{
  //if anything else is typed other than 1 or 2 continue
	System.out.println("I don't think you understood the question.");
    //prints "I dont think you understood the question."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("Try again");
    //prints "Try again"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    kitchen1();
    //calls the function kitchen1() to go back to it
  }
}

public static void wakeup()	{
//public static voidines the fuction wakeup()
  System.out.println("Yawwwwn!");
  //prints Yawwwwn!
  //Thread.sleep(2);
  //Thread.sleeps the program for 2 seconds
  System.out.println("That was a good rest don't you think?");
  //prints "That was a good rest don't you think?"
  System.out.println("Enter 1 for Yes, or 2 for No");
  int choice = sc.nextInt();
  sc.nextLine();
  //creates the function choice and prints "Enter 1 for Yes, or 2 for No"
  if (choice == 1)	{
  //if the user choice is equal to 1 continue
	System.out.println("You bet it was!");
    //prints "You bet it was!"
    //Thread.sleep(1);
    //Thread.sleeps the program for 1 second
    System.out.println("Now let's continue this journey shall we?");
    //prints "Now let's continue this journey shall we?"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    
    System.out.println("Enter 1 to continue, or 2 to stop");
    choice = sc.nextInt();
    sc.nextLine();
    //creates the variable choice and prints "Enter 1 to continue, or 2 to stop"
    if (choice== 1)	{
    //if the user choice is equal to 1 continue
      System.out.println("Great let's get back to securing this place!");
      //prints "Great let's get back to securing this place!"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      journeycontinue();
      //calls the function journeycontinue to continue to it
    }
    
    else if (choice== 2)	{
    //else if the choice is equal to 2 continue
      System.out.println("You stopped the journey.");
      //prints "You stopped the journey"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      System.out.println("Just kidding you can't stop this journey.");
      //prints "Just kidding you can't stop this journey"
      //Thread.sleep(3);
      //Thread.sleeps the program for 3 seconds
      System.out.println("Now let's continue and stop being lazy");
      //prints "Now let's continue and stop being lazy"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      journeycontinue();
      //calls the function journeycontinue() to continue to it
    }
    else	{
    //if anything other than 1 or 2 is entered continue
      System.out.println("I don't think that you understood the question");
      //prints "I don't think that you understood the question"
      //Thread.sleep(3);
      //Thread.sleeps the program for 3 seconds
      System.out.println("Try again");
      //prints "Try again"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      wakeup();
      //calls the function wake up to go back to it
    }
  }
  
  else if (choice == 2)	{
  //else if the user choice is equal to 2 continue
	System.out.println("Well you have no choice we're continuing this journey!");
    //prints "Well you have no choice we're continuing this journey!"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    journeycontinue();
  }
  else	{
  //if the user choice is anything other than 1 or 2 continue
    System.out.println("I don't think that you understood the question");
    //prints "I don't think that you understood the question"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("Try again");
    //prints "Try again"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    wakeup();
    //calls the function wakeup() to continue to it
  }
}

public static void journeycontinue()	{
//public static voidines journeycontinue()
  System.out.println("Well we have baricaded the windows and doors already");
  //prints "Well we have baricaded the windows and doors already"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("We might as well dismantle the table and chairs too.");
  //prints "We might as well dismantle the table and chairs too."
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("What would you like to dismantle first?");
  //prints "What would you like to dismantle first?"
  //Thread.sleep(2);
  //Thread.sleeps the program for 2 seconds
  System.out.println("Enter 1 for Tables, or 2 for chairs");
  int choice = sc.nextInt();
  sc.nextLine();
  //creates the variable choice and prints "Enter 1 for Tables, or 2 for chairs"
  if (choice== 1)	{
  //if the user choice is equal to 1 continue
    System.out.println("You begin to dismantle the tables.");
    //prints "You begin to dismantle the tables"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("As you dismantle one of the tables you find something wierd under it.");
    //prints "As you dismantle one of the tables you find something wierd under it."
    //Thread.sleep(4);
    //Thread.sleeps the program for 4 seconds
    System.out.println("It is a secret passage...");
    //prints "It is a secret passage..."
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    secretpassageentrance();
    //calls the function secretpassageentrance() to continue to it
  }
  else if (choice== 2)	{
  //else if the choice is equal to 2 continue
    System.out.println("You dismantle all of the chairs in a quick matter.");
    //prints "You dismantle all of the chairs in a quick matter."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("Once you finish the chairs, you begin to dismantle all the tables.");
    //prints "Once you finish the chairs, you begin to dismantle all the tables."
    //Thread.sleep(4);
    //Thread.sleeps the program for 4 seconds
    System.out.println("Under one of the tables you find something rather wierd.");
    //prints "Under one of the tables you find something rather wierd"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("There is a secret passageway.");
    //prints "There is a secret passageway."
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    secretpassageentrance();
  }
    //calls the function secretpassageentrance() to go to it
  else	{
  //if anything else is typed continue
    System.out.println("I think you wrote the wrong number.");
    //prints "I think you wrote the wrong number."
    System.out.println("Try again");
    //prints "Try again"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    journeycontinue();
    //calls the function journeycontinue() to go to it
  }
}
    
public static void secretpassageentrance()	{
//public static voidines the function secretpassageentrance
  System.out.println("Do you want to enter this secret passage?");
  //prints "Do you want to enter this secret passage?"
  //Thread.sleep(2);
  //Thread.sleeps the program for 2 seconds
  System.out.println("Enter 1 to go, or 2 to stay");
  int choice = sc.nextInt();
  sc.nextLine();
  //creates the variable choice and asks prints "Enter 1 to go, or 2 to stay"
  if (choice == 1)	{
  //if the choice is equal to 1 continue
    System.out.println("Ok here we go !");
    //prints "Ok here we go !"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    secretpassage();
    //calls the function secretpassage to go to it
  }
  else if (choice == 2)	{
  //else if the user choice is equal to 2 continue
    knockknock();
    //calls the function knockknock() to go to it
  }
  else	{
  //if the user choice is something either than 1 or 2 continue
    System.out.println("I think you have misread the question");
    //prints "I think you have misread the question"
    System.out.println("Try again.");
    //prints "Try again"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    secretpassageentrance();
    //calls the function secretpassageenetrance to go to it
  }
}

public static void secretpassage()	{
//public static voidines the variable secretpassage() 
  System.out.println("You enter the Secret passage");
  //prints "You enter the Secret passage"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("There are 3 doors ahead of you.");
  //prints "There are 3 doors ahead of you."
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("Each are labeled Trap door. Do not Enter");
  //prints "Each are labeled Trap door. Do not Enter"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("Do you want to Enter one of the doors or leave?");
  //prints "Do you want to Enter one of the doors or leave?"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("Enter 1 for door 1, 2 for door 2, 3 for door 3, or 4 to leave.");
  int choice = sc.nextInt();
  sc.nextLine();
  //creates the variable choice and prints "Enter 1 for door 1, 2 for door 2, 3 for door 3, or 4 to leave."
  if (choice== 1)	{
  //if the user choice is equal to 1 continue
    System.out.println("You enter Trap door 1");
    //prints "You enter Trap door 1"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("It is infact a trap.");
    //prints "It is infact a trap."
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("You die.");
    //prints "You die."
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    secretpassage();
    //calls the function secretpassage() to go to it
  }
  else if (choice==2)	{
  //else if the choice is equal to 2 continue
    System.out.println("You enter Trap door 2");
    //prints "You enter Trap door 2"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("It is infact a trap.");
    //prints "It is infact a trap."
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("You die.");
    //prints "You die."
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    secretpassage();
    //calls the function secretpassage() to go to i
  }
  else if (choice==3)	{
  //else if the choice is equal to 3 continue
    System.out.println("You enter Trap door 3");
    //prints "You enter Trap door 3"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("It is infact a trap.");
    //prints "It is infact a trap."
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("You die.");
    //prints "You die"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    secretpassage();
    //calls the function secret passage() to go to it
  }
  else if (choice==4)	{
  //else if the user choice is equal to 4 continue
    System.out.println("Are you sure you want to go back?");
    //prints "Are you sure you want to go back?"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 second
    System.out.println("Enter 1 for Yes, or 2 to go back to secret passage.");
    choice = sc.nextInt();
    sc.nextLine();
    //creates the variable choice and prints "Enter 1 for Yes, or 2 to go back to secret passage."
    if (choice == 1)	{
    //if the user choice is equal to 1 continue
      System.out.println("Ok! Let's Go!");
      //prints "Ok! Let's Go!"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      knockknock();
      //calls the function knockknock() to go to it
    }
    else if (choice == 2)	{
    //else if the choice equals to 2 continue
      System.out.println("Alright! Let's go back!");
      //prints "Alright! Let's go back!"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      secretpassage();
      //calls the function secretpassage() to go to it
    }
    else	{
    //if user choice is something other than 1 or 2 continue
      System.out.println("I think you have misread the question");
      //prints "I think you have misread the question"
      //Thread.sleep(3);
      //Thread.sleeps the program for 3 seconds
      System.out.println("Try again");
      //prints "Try again"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      secretpassage();
      //calls the function secretpassage() to go to it
    }
  }
  else	{
  //if the user choice is something other than 1, 2, 3 or 4 continue
    System.out.println("I think you have misread the question");
    //prints "I think you have misread the question"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("Try again");
    //prints "Try again"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    secretpassage();
    //calls the function secretpassage() to go to it
  }
}

public static void knockknock()	{
//public static voidines the variable knockknock()  
  System.out.println("You hear a knock coming from the door.");
  //prints "You hear a knock coming from the door."
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("Do you want to open the door?");
  //prints "Do you want to open the door?"
  //Thread.sleep(1);
  //Thread.sleeps the program for 1 second
  System.out.println("Enter 1 to open the door, or 2 to keep it closed");
  int choice = sc.nextInt();
  sc.nextLine();
  //creates the variable choice and prints "Enter 1 to open the door, or 2 to keep it closed"
  if (choice == 1)	{
  //if the choice is equal to 1 continue
    System.out.println("You open the door....");
    //prints "You open the door"
    //Thread.sleep(5);
    //Thread.sleeps program for 5 seconds
    System.out.println("To your surprise it's someone you know.");
    //prints "To your surprise it's someone you know."
    //Thread.sleep(3);;
    //Thread.sleeps the program for 3 seconds
    System.out.println("It's.");
    //prints "It's."
    //Thread.sleep(1);
    //Thread.sleeps the program for 1 second
    System.out.println("It's.");
    //prints "It's."
    //Thread.sleep(1);
    //Thread.sleeps the program for 1 second.
    System.out.println("It's Your family they live!");
    //prints "It's Your family they live!"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    Endgame();
    //calls the function Endgame() to continue to it
  }
  else if (choice== 2)	{
  //else if the choice is equal to 2 continue
    System.out.println("The noise is getting louder.");
    //prints "The noise is getting louder."
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("You begin to hear whispers outside the door.");
    //prints "You begin to hear whispers outside the door."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("Someone outside says.");
    //prints "Someone outside says."
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("OPEN THE DOOR, OR WE WILL!");
    //prints "OPEN THE DOOR, OR WE WILL!"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("You're going to have to make a choice whether to open the door or not.");
    //prints "You're going to have to make a choice whether to open the door or not.
    System.out.println("Enter 1 to open Door, Enter 2 to keep it closed.");
    choice = sc.nextInt();
    sc.nextLine();
    //creates variable choice and prints "Enter 1 to open Door, Enter 2 to keep it closed."
    if (choice== 1)	{
    //if the choice is equal to 1 continue
      System.out.println("You aproach the door quickly");
      //prints "You aproach the door quickly"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      System.out.println("You can still go back if you'd like?");
      //prints "You can still go back if you'd like"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      

      System.out.println("Enter 1 to turn handle, Enter 2 to not open.");
      choice = sc.nextInt();
      sc.nextLine();
      //creates the variable choice and prints "Enter 1 to turn handle, Enter 2 to not open"
      if (choice == 1)	{
      //if the user choice is equal to 1 continue
        System.out.println("You slowly turn the handle.");
        //prints "You slowly turn the handle."
        //Thread.sleep(2);
        //Thread.sleeps the program for 2 seconds
        System.out.println("The door opens.");
        //prints "The door opens."
        //Thread.sleep(2);
        //Thread.sleeps the program for 2 seconds
        System.out.println("It's Your family.");
        //System.out.println("It's Your family.");
        //Thread.sleep(3);
        //Thread.sleeps the program for 3 seconds
        Endgame();
        //calls the function endgame() to go to it
      }
      else if (choice == 2)	{
      //else if the user choice is equal to 2 continue
        System.out.println("You step back and wait to see what happens.");
        //prints "You step back and wait to see what happens."
        //Thread.sleep(3);
        //Thread.sleeps the program for 3 seconds
        Bustdoor();
        //calls the function Bustdoor() to go to it
      }
      else	{
      //if the user choice is anything other than 1 or 2 continue
        System.out.println("Invalid choice");
        //prints "Invalid choice"
        //Thread.sleep(3);
        //Thread.sleeps the program for 3 seconds
        System.out.println("Try again");
        //pritns "Try again"
        //Thread.sleep(2);
        //Thread.sleeps the program for 2 seconds
        knockknock();
        //calls the function knock knock to go to it.
      }
    }
    else if (choice == 2)	{
    //else if the choice is equal to 2 continue
      System.out.println("You patiently wait for what happens next.");
      //prints "You patiently wait for what happens next."
      //Thread.sleep(3);
      //Thread.sleeps the program for 3 seconds
      Bustdoor();
      //calls the function Bustdoor() to go to it
    }
    else	{
    //if the user choose anything other than 1 or 2 continue
      System.out.println("Invalid choice.");
      //prints "Invalid choice."
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      System.out.println("Try again");
      //prints "Try again"
      //Thread.sleep(2);
      //Thread.sleeps the program for 2 seconds
      knockknock();
      //calls the function knockknock() to go to it.
    }
  }
}
    

public static void Bustdoor()	{
//public static voidines the function Bustdoor():
  System.out.println("The door gets busted down.");
  //prints "The door gets busted down."
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("It's your family.");
  //prints "It's your family."
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  Endgame();
  //call the function Endgame() to go to it.
}
    
  

public static void gunroom()	{
//public static voidines the variable gunroom()  
  System.out.println("Ok, you don't have to continue if you dont want to.");
  //prints "Ok, you don't have to continue if you dont want to."
  //Thread.sleep(2);
  //Thread.sleeps the program for 2 seconds
  System.out.println("1. Turn the handle and take the chance of the alarm going off?"
  +"2. Return to the kitchen?");
  //prints
  //1. Turn the handle and take the chance of the alarm going off?
  //2. Return to the kitchen?
  System.out.println("Enter 1 to enter the room, Enter 2 to return to kitchen");
  int choice = sc.nextInt();
  sc.nextLine();
  //creates the variable choice and prints "Enter 1 to enter the room, Enter 2 to return to kitchen"
  if (choice == 1)	{
  //if the user choice equals to 1 continue 
    System.out.println("BEEP! BEEP! BEEP!");
    //prints "BEEP! BEEP! BEEP!"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("....Groan....");
    //prints "....Groan...."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    gunroominside();
    //calls the function gunroominside() to continue to it
  }
  else if (choice == 2)	{
  //else if the choice is equal to 2 continue
    kitchen1();
    //calls the function kitchen1() to go to it
  }
  else	{
  //if the user choice is something other than 1 or 2 continue
    System.out.println("I think you have misread the question");
    //prints "I think you have misread the question"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("Try again");
    //prints "Try again"
    //Thread.sleep(1);
    //Thread.sleeps the program for 1 seconds
    gunroom();
    //calls the function gunroom() to go to it
  }
}
    

public static void gunroominside()	{
//public static voidines gun room inside
  System.out.println("Quickly! Grab a gun! THE ZOMBIES ARE COMING!");
  //prints "Quickly! Grab a gun! THE ZOMBIES ARE COMING!"
  //Thread.sleep(2);
  //Thread.sleeps the program for 2 seconds
  System.out.println("Your choice of guns are:\n"
  +"1: Pistol\n"
  +"2: Shotgun");
  //prints '''Your choice of guns are:
  //1: Pistol
  //2: Shotgun
  
  System.out.println("Enter 1 for Pistol, Enter 2 for Shotgun");
  int choices = sc.nextInt();
  sc.nextLine();
  //creates the variable choices and prints "Enter 1 for Pistol, Enter 2 for Shotgun"
  if (choices == 1 && backpack.contains("Pistol"))	{
  //if the user choice is equal to 1 and Pistol is not in Backpack continue
    if (backpack.contains("Pistol")) {
    //if "Pistol" is already in the variable Backpakc continue
      System.out.println("You already have a Pistol you goof!");
      //prints "You already have a Pistol you goof!"
    }
    if (!backpack.contains("Pistol")) {
    //if "Pistol" is not in the variable Backpack continue
      System.out.println("Good choice, flexible gun with lots of options!");
      //prints "Good choice, flexible gun with lots of options!"
      backpack.add("Pistol");
      //Adds the String Pistol to The variable Backpack
    }
  }
  else if (choices == 2 && !backpack.contains("Shotgun"))	{
  //else if the user choice is equal to 2 and Shotgun is not in Backpack continue
    if (backpack.contains("Shotgun"))	{
    //if the "Shotgun" string is in Backpack continue
      System.out.println("You already have a Pistol you goof!");
      //prints "You already have a Pistol you goof!"
    }
    if (!backpack.contains("Shotgun"))	{
    //if "Shotgun" string is not in Backpack continue
      System.out.println("Good choice, Easy kills with this bad boy!");
      //prints "Good choice, Easy kills with this bad boy!"
      backpack.add("Shotgun");
      //Adds the string "Shotgun" to the variable Backpack
    }
  }
  else	{
  //if something else other than 1 or 2 is chosen continue
    System.out.println("Wasn't in the choices sorry");
    //prints "Wasn't in the choices sorry"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    gunroominside();
    //calls the function gunroominside to go to it
  }
    
  System.out.println("5 zombies are incoming!");
  //prints "5 zombies are incoming!"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("Are you going to run? Or are you going to fight?");
  //prints "Are you going to run? Or are you going to fight?"
  System.out.println("Enter 1 to Run, or Enter 2 to fight!");
  int choice = sc.nextInt();
  sc.nextLine();
  //makes the variable choice and prints "Enter 1 to Run, or Enter 2 to fight!"
  if (choice == 2)	{
  //if the user choice is 1 continue
    System.out.println("PREPARE TO FIGHT!!");
    //prints "PREPARE TO FIGHT!!"
    Fightnumber1();
    //calls the function Fightnumber1() to go to it
  }
  else if (choice == 1)	{
  //else if the choice is equal to 2 continue
    System.out.println("You run right into the hoard of zombies and get caught.");
    //prints "You run right into the hoard of zombies and get caught."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("You die sorry.");
    //prints "You die sorry."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    gunroominside();
    //calls the function gunroominside() to continue to it
  }
  else	{
  //if anything else is written other than 1 or 2 continue
    System.out.println("I don't think you understood the question.");
    //prints  "I don't think you understood the question"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("Try again");
    //prints "Try again"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    gunroominside();
    //calls the function gunroominside() to go back to it
  }
}

public static void Fightnumber1()	{
//public static voidines Fightnumber1 with no parameters
  System.out.println("Intense music incoming!");
  //prints "Intense music incoming!"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("First zombie coming");
  //prints "First zombie coming"
  //Thread.sleep(2);
  //Thread.sleeps the program for 2 seconds
  System.out.println("Enter 1 to shoot in the head or 2 in the chest");
  int choice = sc.nextInt();
  sc.nextLine();
  //creates the variable choice and asks the user "Enter 1 to shoot in the head"
  if (choice == 1)	{
  //if the choice is equal to 1 continue
    System.out.println("You shoot the zombies in the head");
    //prints "You shoot the zombies in the head"
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    System.out.println("They all die");
    //prints "They all die"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("Congratulations");
    //prints Congratulations
  }
}
  
public static void Endgame()	{
//public static voidines function Endgame()
  System.out.println("Congratulations!");
  //prints "Congratulations!"
  //Thread.sleep(2);
  //Thread.sleeps the program for 2 seconds
  System.out.println("You have succesfully found your family!");
  //prints "You have succesfully found your family!"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("And without dying too!");
  //prints "And without dying too!"
  //Thread.sleep(2);
  //Thread.sleeps the program for 2 seconds
  System.out.println("I hope....");
  //prints "I hope...."
  //Thread.sleep(2);
  //Thread.sleeps the program for 2 seconds
  System.out.println("Would you like to play again or End?");
  //prints "Would you like to play again or End?"
  //Thread.sleep(3);
  //Thread.sleeps the program for 3 seconds
  System.out.println("Enter 1 to play again or 2 to End.");
  int choice = sc.nextInt();
  sc.nextLine();
  //creates the variable choice and prints "Enter 1 to play again or 2 to End."
  if (choice == 1)	{
  //if the user choice is equal to 1 continue
    System.out.println("Good Luck!");
    //prints "Good Luck!"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    YourRoom();
    //calls the function YourRoom() to go to it
  }
  else if (choice == 2)	{
  //else if the user choice is equal to 2 continue
    System.out.println("Ok that's Fine!");
    //prints "Ok that's Fine!"
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("Just press the Stopâ—»ï¸� button at the top");
    //prints "Just press the Stopâ—»ï¸� button at the top"
  }
  else	{
  //if user choice is anything other than 1 or 2 continue
    System.out.println("Come on it's the end of the game.");
    //prints "Come on it's the end of the game."
    //Thread.sleep(2);
    //Thread.sleeps the program for 2 seconds
    System.out.println("And you still don't understand enter 1 or 2. Jeeze.");
    //prints "And you still don't understand enter 1 or 2. Jeeze."
    //Thread.sleep(3);
    //Thread.sleeps the program for 3 seconds
    Endgame();
    //calls the function Endgame() to go to it.
  }
}
  
//calls the function YourRoom() which untimately starts the whole game

	public static void main(String[] args) {
	  System.out.println("This game will be based on your choices.");
	//prints "This game will be based on your choices."
	  System.out.println("Choose Wisely.");
	//prints "Choose Wisely."
		// TODO Auto-generated method stub
	  YourRoom();

	}

}
