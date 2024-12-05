import java.util.Scanner;

public class WhatsForLunch {

	public static void main(String[] args) {
		
		//single-line comment
		//upper-case letter = new Class
		
		/*
		 *Multi-line
		 *comment
		 */
		
		//print a message on the console
		System.out.println("Welcome to my first Java program!!!");
		
		/*
		 * Escape Characters
		 * 		\n - new line
		 *		 \"- double quote
		 */
		
		System.out.print("\"JAVA\" is Fun!\n");
		
		//system.out puts info onto the console
		//system.in puts it into the code
		
		// create a Scanner object
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("What\'s for lunch today? \nEnter entree: ");
	
		
		String entree;		//declare a variable
		
		entree = key.nextLine();
		//assignment operator- takes what is on the right hand side and putting it on the left(it reads the next line the user inputs and store it into the variable(entree)
		
		
		// + concatenation operator
		//assignment operator
		System.out.println("Please Enter a Side and Drink");
		
		String side = key.next();
		key.nextLine();		//reads the remainder of the current line
		
		String drink = key.nextLine();
		//.next is  a scanner method for the next class that will read the first word(nextLine = line)
		
		System.out.println("Entree: "+ entree);
		
		System.out.println("Side: "+ side);
		
		System.out.println("Drink: "+ drink);
		
		
		
	}

}
