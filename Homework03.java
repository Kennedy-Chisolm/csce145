//Kennedy Chisolm
import java.util.Scanner;
import java.util.Random; 
public class Homework03 {
	
	public static final int MAX = 4;
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Random r = new Random();
		int choice = r.nextInt(MAX);
		
		String hand = "";
		switch(choice)
		{
		case 0:
			hand = "Rock";
			break;
		case 1: 
			hand = "Scissors";
			break;
		case 2: 
			hand = "Paper";
			break;
		/*case 3:
			hand = " "; //when this is here,sometimes the comps option is "_"
			break;*/
		default:
				System.out.println("Error!!");
		}
		
		System.out.println("Welcome to ROCK! PAPER! SCISSORS! A true game of luck... or is it?");
		System.out.println("Would you like to play? \nPlease enter \"Yes\" or \"No\":");
		
		String response1 = key.next();
		
		if(response1.equalsIgnoreCase("No"))
		{
			System.out.println("Aw I guess you are to good for ROCK! PAPER! SCISSORS! Maybe next time...Have a great day! Bye!");
			System.exit(0);
		}
		else
		{
			System.out.println("Awesome! Let the Game Begin!");
		}
		String response3 = "";
	do
		
		{
		int humanCount = 0;
		int compCount = 0;
		
		while(humanCount <=2 || compCount <= 2)  //humanCount == 0 && compCount == 0)
		{
		System.out.println("Please enter: ");
		System.out.println("\"Rock\"...\n\"Paper\"..\nor\n\"Scissors\"...");
		String response2 = key.next();
		System.out.println("  SHOOT!  ");
		System.out.println(response2 + " -><- " + hand + "!");
		
		String rock= "Rock" ;
		String scissors = "Scissors" ;
		String paper = "Paper";
		//String other = "";
		//if(humanCount < 3 || compCount <3 )
		//{
		//while(humanCount<3 || compCount<3 )
	//{
		{
	
		
		//if you choose "Rock" here are your outcomes
			/*if(other.equalsIgnoreCase(response2) && rock.equalsIgnoreCase(hand))
			{
				System.out.println("Invalid word entered! The computer gets a point!");
				compCount+=1;
				System.out.println("You: " + humanCount + " Computer: " + compCount + "\n");
			}
			*/
			
			if(rock.equalsIgnoreCase(response2) && scissors.equalsIgnoreCase(hand))
		{
			System.out.println("\nYou get a Point!");
			humanCount+=1;
			System.out.println("You: " + humanCount + " Computer: " + compCount + "\n" );
		}
		else if (rock.equalsIgnoreCase(response2) && paper.equalsIgnoreCase(hand))
		{
			System.out.println("\nThe computer gets a Point!");
			compCount+=1;
			System.out.println("You: " + humanCount + "	Computer: " + compCount  + "\n");
		}
		else if(rock.equalsIgnoreCase(response2) && rock.equalsIgnoreCase(hand))
		{
			System.out.println("\nTIE! No one gets a point!");
			System.out.println("You: " + humanCount + " Computer: " + compCount  + "\n");
		}
		/*if(humanCount == 2 && compCount < 2)
		{
			System.out.print(" Congrats you won!!\n\nFinal Score: You: " + humanCount + "   Comp: " + compCount + "\n");
		}
		else if(humanCount < 2 && compCount == 2)
		{
			System.out.print("Oh no! You lost...\n\nFinal Score: You: " + humanCount + "   Comp: " + compCount+ "\n");
		}*/
			
		
		//if you choose scissors here are your outcomes
		if(scissors.equalsIgnoreCase(response2) && paper.equalsIgnoreCase(hand))
		{
			System.out.println("\nYou get a Point!");
			humanCount+=1;
			System.out.println("You: " + humanCount + " Computer: " + compCount );
		}
		else if (scissors.equalsIgnoreCase(response2) && rock.equalsIgnoreCase(hand))
		{
			System.out.println("\nThe computer gets a Point!");
			compCount+=1;
			System.out.println("You: " + humanCount + "	Computer: " + compCount );
		}
		else if(scissors.equalsIgnoreCase(response2) && scissors.equalsIgnoreCase(hand))
		{
			System.out.println("\nTIE! No one gets a point!");
			System.out.println("You: " + humanCount + " Computer: " + compCount );
		}
		/*else if(humanCount == 2 && compCount < 2)
		{
			System.out.print("Congrats you won!!\n\nFinal Score: You: " + humanCount + "   Comp: " + compCount + "\n");
		}
		else if(humanCount < 2 && compCount == 2)
		{
			System.out.print("Oh no! You lost...!!\n\nFinal Score: You: " + humanCount + "   Comp: " + compCount+ "\n");
		}*/
		
		//if you choose paper here are your outcomes
		if(paper.equalsIgnoreCase(response2) && rock.equalsIgnoreCase(hand))
		{
			System.out.println("\nYou get a Point!");
			humanCount+=1;
			System.out.println("You: " + humanCount + " Computer: " + compCount + "\n");
		}
		else if (paper.equalsIgnoreCase(response2) && scissors.equalsIgnoreCase(hand))
		{
			System.out.println("\nThe computer gets a Point!");
			compCount+=1;
			System.out.println("You: " + humanCount + "	Computer: " + compCount + "\n" );
		}
		else if(paper.equalsIgnoreCase(response2) && paper.equalsIgnoreCase(hand))
		{
			System.out.println("\nTIE! No one gets a point!");
			System.out.println("You: " + humanCount + " Computer: " + compCount + "\n");
		}
		
		
		if(humanCount == 2 && compCount < 2)
		{
			System.out.print("Congrats you won!!\n\nFinal Score: You: " + humanCount + "   Comp: " + compCount + "\n");
		}
		else if(humanCount < 2 && compCount == 2)
		{
			System.out.print("Oh no! You lost...!!\n\nFinal Score: You: " + humanCount + "   Comp: " + compCount + "\n");
		}
			
		
		/*else
		{
			System.out.println("Invalid word entered! The computer gets a point!");
			compCount+=1;
			System.out.println("You: " + humanCount + " Computer: " + compCount );
			
		}
		*/
		}
		
		
	//}
		
		/*else if(humanCount == 2 && compCount < 2)
		{
			System.out.print("Congrats you won!!\nFinal Score: You: " + humanCount + "   Comp: " + compCount);
		}
		else if(humanCount < 2 && compCount == 2)
		{
			System.out.print("Congrats you won!!\nFinal Score: You: " + humanCount + "   Comp: " + compCount);
		}
		*/
		
	


		System.out.println();//("Do you want to play again? Enter \"Yes\" or \"No\": ");
		
		// response3 = key.next();
		}
	

		}while(response3.equalsIgnoreCase("Yes"));
	//if(response3.equalsIgnoreCase("No"));
	//{
	System.out.println("Exiting the program!");
	//System.exit(0);
	//}
}

}
