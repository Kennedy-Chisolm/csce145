import java.util.Scanner;
public class Homework01 {
//Kennedy Chisolm
	//note write 5 comments describing said code
	public static final int TODAYS_Year = 2024;
	
	// I declared a final method in order to keep this current year a constant in my code
	
	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		
		System.out.println("Hello! Please enter your first name: ");
		
		String firstName = key.nextLine();
		
		System.out.println("Please enter your last name: ");
		
		String lastName = key.nextLine();
		
		System.out.println("Please enter your phone number(please no dashes or parenthesis): ");
		
		String phoneNum = key.nextLine();
		
		System.out.println("Please enter your major: ");
		
		String major = key.nextLine();
		
		System.out.println("Please enter your year(Freshman, Sophomore, Junior, or Senior): ");
		
		String uniYear = key.nextLine();
		
		System.out.println("Please enter todays date(using the format: mm/dd/yyyy: ");
		
		String date = key.nextLine();
		
		System.out.println("Please enter your favorite animal: ");
		
		String favAnimal = key.nextLine();
		
		System.out.println("Please enter your favorite color");
		
		String favColor = key.nextLine();
		
		System.out.println("Please enter your favorite sport: " );
		
		String favSport = key.nextLine();
		
		System.out.println("Please enter your age(assume the age you will be turning this year): ");
		
		int age = key.nextInt();
		
		//All questions are asked, and receives an input from the user that are stored in different variables(Strings and ints)
		
		int birthYear = (TODAYS_Year - age); 
		
		//new int used in order to find the users birth year by subtracting their age from the final int declared in the beginning
		
		String newDate = date.substring(3,4) + date.substring(4,5) + "." + date.substring(0,1) + date.substring(1,2) + "." + date.substring(6,7) + date.substring(7,8) + date.substring(8,9) + date.substring(9,10);
		
		String newPhoneNum = "(" + phoneNum.substring(0,1)+ phoneNum.substring(1,2) + phoneNum.substring(2,3) + ")" + phoneNum.substring(3,4) + phoneNum.substring(4,5) + phoneNum.substring(5,6) + "-"  + phoneNum.substring(6,7)
		+ phoneNum.substring(7,8) + phoneNum.substring(8,9) + phoneNum.substring(9,10);
		
		//both the dates and phone number is taken and converted into a new format using their substrings to create the desired format
		
		System.out.println("\nHeres a quick intro for " + firstName + " " + lastName + ": \n" +"\n \t\"You were born in the year " + birthYear + ". Out of all the sports, your favorite is " + favSport + ". \n You love " + favAnimal + "s"  
				+ " and your favorite color is " + favColor +  ". You are a " + uniYear + " at USC majoring in " 
				+ major + ". \n You can be reached at " +  newPhoneNum + ". Congrats! you are now officially a Gamecock!\"" );
		
		System.out.println("\n Last updated: "+ newDate);
		
		//final print.out statement uses all the elements and variables the user put in to create a paragraph of information for the user. 
		
		
	}

}
