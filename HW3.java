//Kennedy Chisolm
import java.util.Scanner;
import java.util.Random;
public class HW3 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Welcome to ROCK! PAPER! SCISSORS! A true game of luck... or is it?");
		System.out.println("Would you like to play? \nPlease enter \"Yes\" or \"No\":");
		
		String intialPlay = key.nextLine();
		//asks the user if they want to play
		if(!intialPlay.equalsIgnoreCase("yes"))
		{
			System.out.println("Aw I guess you are to good for ROCK! PAPER! SCISSORS! Maybe next time...Have a great day! Bye!");
			System.exit(0);
		
		}
		
		//begins the rock paper scissor rounds, to determine the winner
		while(true)
		{
			int humanCount = 0;
			int compCount = 0;
			
			
			for(int round = 1; round<=3; round++)
			{
				//System.out.println("Awesome! Let the Game Begin!");
				System.out.println("\nRound " + round + ":");
				System.out.println("Please enter: ");
				System.out.println("\"Rock\"...\n\"Paper\"..\nor\n\"Scissors\"...");
			
				
				String humanChoice = key.nextLine();
				//automatically gives the computer a point if an invalid input is set 
				while(!humanChoice.equalsIgnoreCase("rock") && !humanChoice.equalsIgnoreCase("scissors") && !humanChoice.equalsIgnoreCase("paper"))
				{
					System.out.println("Invalid input. Please enter 'Rock' 'Paper' or 'Scissors'");
					System.out.println("The computer gets a point!");
					compCount+=1;
					System.out.println("You: " + humanCount + " Computer: " + compCount + "\n" );
					humanChoice= key.nextLine();
				}
				//random choice for "rock" "paper" or "scissors"
				int choice = r.nextInt(3);
				
				String compChoice = choice == 0 ? "Rock" : choice == 1 ? "Scissors"  : "Paper";
				
				System.out.println("  SHOOT!  ");
				System.out.println(humanChoice + " -><- " + compChoice + "!");
				//if-else block determining the points that are awarded to the computer or user
				if(humanChoice.equalsIgnoreCase(compChoice))
				{
					System.out.println("TIE!");
				}
				else if((humanChoice.equalsIgnoreCase("Rock") && compChoice.equalsIgnoreCase("Scissors")) ||
						(humanChoice.equalsIgnoreCase("Paper") && compChoice.equalsIgnoreCase("Rock")) ||
						(humanChoice.equalsIgnoreCase("Scissors") && compChoice.equalsIgnoreCase("Paper")))
					
				{
					System.out.println("\nYou get a Point!");
					humanCount+=1;
				}
				else 
				{
					System.out.println("\n The computer gets a Point!");
					compCount+=1;
				 	System.out.println("You: " + humanCount + " Computer: " + compCount + "\n" );
				}
			}
			//prints out the final score for the user and the computer 
			System.out.println("\nFinal score\nYou: " + humanCount + " Computer: " + compCount + "\n" );
			
			//alerts the winner or if its a tie using an if-else block-
			if(humanCount > compCount)
			{
				System.out.println("You win!");
			}
			else if(compCount> humanCount)
			{
				System.out.println("Oh no! The computer wins!");
			}
			else
			{
				System.out.println("Its a tie :)");
			}
			System.out.println("\nDo you want to play again? 'Yes' or 'No'");
			String playAgain = key.nextLine();
			
			//prompts the user if they want to play again
			if(!playAgain.equalsIgnoreCase("yes"))
			{
				System.out.println("Thank you for playing! See you next time! :)");
				
				break;
			}
		}
		
		//exits the program if they say no
			System.exit(0);

	}
	

}
