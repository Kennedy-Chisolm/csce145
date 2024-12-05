//Kennedy Chisolm
import java.util.Scanner;
public class Lab04 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		//Scanner key
		System.out.println("How many books did you purchase at BN booksellers this month? ");
		//PROMPTS THE USER TO PUT IN A NUMBER OF BOOKS PURCHASED
		
		int books = key.nextInt();
		//Accepts and stores an input by the user
		if(books<0)
		{
			System.out.println( "Error! Now exiting the program!");
			System.exit(0);
		}
		//alerts and exits program if they enter a negative number
		switch(books)
		{
		case 0:
				books = 0;
				System.out.println("Congratulations! You\'ve earned 0 points");
				break;
		case 1:
				books = 1;
				System.out.println("Congratulations! You\'ve earned 5 points");
				break;
		case 2:
				books = 2;
				System.out.println("Congratulations! You\'ve earned 15 points");
				break;
		case 3:
				books = 3;
				System.out.println("Congratulations! You\'ve earned 30 points");
				break;
		default: 
			books = 4;
			System.out.println("Congratulations! You\'ve earned 60 points");
			//if a number 4 or greater is purchased they will earn 60 points
			
			
		}
		//switch overall- computer will read a users input, and put it in a switch in order to determine how many points the user receives
		
	}

}
