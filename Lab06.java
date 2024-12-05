//Kennedy Chisolm
import java.util.Scanner;
public class Lab06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		//Prompts the user to enter a height desired to create a triangle
		System.out.println("Enter the height of the triangle: ");
		//accepts a height entered in by the user
		int height = key.nextInt();
		//gives an error and exits the program if the user inputs a number smaller that 0 
		 if(height < 0)
		 {
			 System.out.println("Not a valid height for the traingle! Now exiting...");
			 System.exit(0);
		 }
		//Prints out the first half of the triangle including the top level aka the height entered
		for(int i = 0; i < height + 1 ; i++) //Initialization, condition, increment
		{

		
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		//Prints out the descending order of * to create the second half of the triangle
		for(int i = height-1; i >= 1 ; i--) //Initialization, condition, increment
			{
			
				for(int j = 1; j <= i; j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
				

		}
	}

}
