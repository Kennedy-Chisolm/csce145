import java.util.Scanner;

public class GreaterThanAValue {
	
public static final int VALUE = 1000;		//constant

	public static void main(String[] args) {
		 
		//package - a library of classes that have been pre-defined
		//eg: Scanner
		
		//creating a Scanner object
		Scanner key = new Scanner(System.in);
		
		//asks the user for an input value
		System.out.println("Enter an integer: ");
		
		int number = key.nextInt();
		//reserved words are in orange - you cannot create that as a identifier name
		if(number > VALUE)
		{ 
			//if block-- implements only if the "if is true"
			System.out.println("The number entererd is greater than 1000!");
		}
		else
		{
			System.out.println("The number entered is not greater than 1000! :( " );
		}
		
		//System.out.println();
		
	}

}
