//Kennedy Chisolm
import java.util.Scanner;
public class Homework04 {
	public final static double PI = 3.14;
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Please enter the size of your circle list!");
		
		int size = key.nextInt();
		
		//Allows the user to put in multiple different sizes until they get a valid size for the array
		while(size<=0)
		{
			System.out.println("Invalid list size entered! Please try again");
			
			size = key.nextInt();
		}
		
		
		double [] myArray = new double[size];
		
		
		for(int i = 0; i < myArray.length; i++)

		{
			System.out.println("Enter the radius of your circles at index: " + i + ":");
			
			 myArray[i] = key.nextDouble();
			
			
		}
		//asks the user what information they would like to know for their circles
		System.out.println("Now that you have entered your radius', what information would you like?");
		
		int userPick = 0;
		do
		{	
		System.out.println("Please click corresponding numbers, here are your options: \n1: Circle Data: Total # and Radius of each circle.\n2: Sort and the circles’ areas from smallest to largest.\n3: Sort and display the circles’ areas from largest to smallest\n4: Find and display all unique circles’ areas in the collection.\n5: Quit the program." );
		userPick = key.nextInt();
		
		while(userPick<1 || userPick>5)
		{
			System.out.println("Invalid number! Please pick another.");
			System.out.println("Please click corresponding numbers, here are your options: \n1: Circle Data: Total # and Radius of each circle.\n2: Sort and the circles’ areas from smallest to largest.\n3: Sort and display the circles’ areas from largest to smallest\n4: Find and display all unique circles’ areas in the collection.\n5: Quit the program." );
			userPick = key.nextInt();
		}
		
		//if the user selects this section it will tell them how many circles they wanted and how much is eachs area
		if(userPick==1) {
		System.out.println("You have entered " + size + " circle's radius");
		
		
		for(int i = 0; i<myArray.length; i++)
		{
			
		System.out.print(myArray[i] + ", ");
		
		}
		
		
		System.out.println();
		System.out.println("This is the areas of your circles: ");
		
		
		//finds the circles area
		for(int i = 0; i<myArray.length; i++)
		{
			
		System.out.print(((Math.pow(myArray[i], 2))*PI) + ", ");
		
		}
		
		System.out.println();
		}
		
		if(userPick==2) {
		//sorts the data least to greatest
		for(int i = 0; i < myArray.length; i++)
		{
			int minIndex = i;
			double smallest = myArray[i];
			
			for(int j = i + 1; j < myArray.length; j++)
			{
				if(myArray[j] < smallest)
				{
					smallest = myArray[j];
					minIndex = j;
				}
			}
			if(smallest < myArray[i])
			{
				double temp = myArray[i];
				myArray[i] = myArray[minIndex];
				myArray[minIndex] = temp;
			}
		}
		
		//print the content of what is in the array after its been sorted
		System.out.println();
		System.out.println("Here is your area sorted from least to greatest! ");
		for(int i = 0; i < myArray.length; i++)
		{
			System.out.println((Math.pow(myArray[i], 2)*PI) + " ");
		}
		
		}
		
		if(userPick==3) {
		
		//sorts the areas from greatest to least 
		for(int i = 0; i < myArray.length; i++)
		{
			int maxIndex = i;
			double greatest = myArray[i];
			
			for(int j = i + 1; j < myArray.length; j++)
			{
				if(myArray[j] > greatest)
				{
					greatest = myArray[j];
					maxIndex = j;
				}
			}
			if(greatest > myArray[i])
			{
				double temp = myArray[i];
				myArray[i] = myArray[maxIndex];
				myArray[maxIndex] = temp;
			}
		}
		
		//print the content of what is in the array after sorted
		System.out.println();
		System.out.println("Here is your area sorted from greatest to least! ");
		for(int i = 0; i < myArray.length; i++)
		{
			System.out.println((Math.pow(myArray[i], 2)*PI) + " ");
		}
		
	}
		
		if(userPick==4) {
		//prints out all unique circles if there are any.
		boolean[] duplicate = new boolean[myArray.length];
		for(int i = 0; i < myArray.length; i++)
		{
			for(int j = i + 1; j < myArray.length; j++)
			{
				if(myArray[i]==myArray[j])
				{
					duplicate[j] = true;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Here is your unique circle list! ");
		for(int i = 0; i < myArray.length; i++)
		{
			if(!duplicate[i])
			{
				System.out.println(Math.pow(myArray[i], 2)*PI);
			}
		}
		}
		
		if(userPick == 5)
		{
			System.out.println("Now exiting!");
			System.exit(0);
		}
		
		
	//prompts the user if they want more info and restarts the program if yes, otherwise it will stop the program
		System.out.println("Would you like more info? Please type '0' for yes, and '1' if you would not.");
		
		userPick = key.nextInt();
		
		if(userPick==1)
		{
			System.out.println("Have a great day! ");
		
		}
		
		}while(userPick==0);
		
		
	}

}
