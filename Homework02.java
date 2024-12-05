import java.util.Random;
import java.util.Scanner;
public class Homework02 {
//Kennedy Chisolm
	public static final int MAX = 3;
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		//scanner object to accept an input from a user
		
		System.out.println("\"Hello! Welcome to the \'Choose your Own Adventure Game\'!\" \nIn this game, you are looking for an escape home. You will be faced with series of decisions. The goal is not to die but rather to live so choose wisely"
				+ "\nPlease pick a destination between the follwing: " +
				 "\'Enchanted Forest\' \'Timeless Swamp\' \'Fairy Village\' \'Lost Oasis\' " );
		
		String response = key.nextLine();
		//accepts the desirer location a user wants to go to 		
		if(response.equalsIgnoreCase("Enchanted Forest"))
		{	
			System.out.println("Welcome to the Enchanted Forest! You see a pile of leaves-- would you like to jump in? Enter \"Yes\", or \"No\":");
			
			response = key.nextLine();
		
	
		 if(response.equalsIgnoreCase("Yes"))
		{
			System.out.println("You jumped in the pile of leaves!\n It had poisonous spiders that bit you. You are now DEAD. /n Better luck next time--now exiting your adventure...");
			System.exit(0);
		}
		else if (response.equalsIgnoreCase("No"))
		{
			System.out.println("You avoided the poisonous spiders! Lets continue! You see an old woman walking in the forest... will you go talk to her? \'Yes\' or \'No\' ");
			response = key.next();
		}
				 
		if(response.equalsIgnoreCase("Yes"))
		{
			System.out.println("The woman was a good fairy who made your dreams come true! You can now live happily ever after! Thanks for playing!");
			System.exit(0);
		}
		else if(response.equalsIgnoreCase("No"))
		{
			System.out.println("You avoided the old lady and continued to walk deeper in the forest. You get lost and die of starvation. Better luck next time!");
		}
		else
		{
			System.out.println("You have entered an invalid response! You said: " + response + " Now exiting");
		}
	}
		//enchanted forest code. if string is entered, the computer will run the enchanted forest code.
		//uses if and else blocks to accept a users input and determine the outcomes
		
		Random r = new Random();
		
		int diceNumber = r.nextInt(MAX);
		
		if(response.equalsIgnoreCase("Lost Oasis"))
		{
			
		System.out.println("Welcome to the Lost Oasis! Oh no! Youell asleep on a log that drifted into the middle of the water-eating piranhas What's? You see a Pirate Captain! You yell for his help! HELPPPP");
		System.out.println("The captain hears your cry and moves his boat towards you. You tell him you need to get back to shore.\nThe Captain decides to play a game to determine if he will help you. Will you play his game? \'Yes\' or \'No\' ");
		
		response= key.next();
		
		if(response.equalsIgnoreCase("yes"))
		{
		boolean trueGuess = false;
		
		while(trueGuess == false)//boolean expression 
		{
			System.out.println("The captain tells you to \"Pick a random number between 0 and 3.\" Can you guess the right number?");
			System.out.println("Enter your guess: ");
			
			int guess = key.nextInt();
			
			
			//input validation
			if(guess > 3 || guess <0)
			{
				System.out.println("Invalid output entered");
				System.exit(0);
			}
			
			else if ( guess == diceNumber)
			{
				System.out.println("Your guess is correct!!! The Pirate Captain helps you back to shore! you are now safe! ");
				trueGuess = true;
				//always run the boolean as false as it will keep running until it is true then in the statement you want the loop to end with the boolean to be true
				
			}
			else
			{
				System.out.println("You got it wrong! You have been thrown to the piranhas!");
				System.exit(0);
			}
		}
		}
		
		else if(response.equalsIgnoreCase("no"))
		{
			System.out.println("You have chosen to not play his game. The Captain Leaves. Your log raft continues to float, in the water, you were never heard from again.");
			System.exit(0);
		}

	}
		//lost oasis code. if string is entered, the computer will run the lost oasis code.
		
		
		
		if(response.equalsIgnoreCase("Timeless Swamp"))//String comparisons
		{
			//String letter = key.next();
			
			System.out.println("Welcome to the Timeless Swamp! This place is eerie and a path of chance! Goodluck traveler!\n You see a frog, a rat and a beetle. Which one will you pick? \'frog\', or \'rat\' or \'beetle\':");
			
			response = key.nextLine();
			
		 if(response.equalsIgnoreCase("frog"))
		{
			System.out.println("You selected the frog! Now choose a number between 1 and 2");
			int num = key.nextInt();
			
			
			if(num == 1)//numeric comparison
			{
				System.out.println("You have selected the number: 1\nNow enter a letter \'A\' or \'B\'");
				String letter = key.next();
				//letter = key.next();
				
				if(letter.equalsIgnoreCase("A"))
				{
					System.out.println("THE FROGG HAS TURNED INTO A MIGHT CREATURE WITH WINGS! It ate you.");
					System.exit(0);
				}
				else if(letter.equalsIgnoreCase("B"))
				{
					System.out.println("The frog has turned into a wizard! It teleported you back home.");
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid number inputed now exiting!");
					System.exit(0);
				}
				
			}
		
			else if(num == 2)
			{
				System.out.println("You have selected the number: 2\nNow enter \'A\' or \'B\'");
				String letter = key.next();
				
			
				if(letter.equalsIgnoreCase("A"))
				{
					System.out.println("The frog became your friend and showed you the way out!");
					System.exit(0);
				}
				else if(letter.equalsIgnoreCase("B"))
				{
					System.out.println("The frog got scared and bit you and nothing happened. You stay in the swamp forever.");
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid number inputed now exiting!");
					System.exit(0);
				}
			}
		}
		
			else if(response.equalsIgnoreCase("rat"))
			{
				System.out.println("You selected the rat! Now choose a number between 1 and 2");
				int num = key.nextInt();
				
				if(num == 1)
				{
					System.out.println("You have selected the number: 1\nNow enter a letter \'A\' or \'B\'");
					String letter = key.next();
					
					if(letter.equalsIgnoreCase("A"))
					{
						System.out.println("The rat called its friends and they took you home");
						System.exit(0);
					}
					else if(letter.equalsIgnoreCase("B"))
					{
						System.out.println("The rat was infected and bit you! You died from an unknown disease");
						System.exit(0);
					}
					
				}
				else if(num ==2)
				{
					System.out.println("You have selected the number: 2\nNow enter \'A\' or \'B\'");
					String letter = key.next();
					
					if(letter.equalsIgnoreCase("A"))
					{
						System.out.println("The rat ran away! You are now lost in the forest!");
						System.exit(0);
					}
					else if(letter.equalsIgnoreCase("B"))
					{
						System.out.println("The rat is friends with a witch, she turned you into swamp mud.");
						System.exit(0);
					}
				}
			}
		 else if(response.equalsIgnoreCase("beetle"))
			{
				System.out.println("You selected the beetle! Now choose a number between 1 and 2");
				int num = key.nextInt();
				
				
				if(num == 1)
				{
					
					System.out.println("You have selected the number: 1\nNow enter a letter \'A\' or \'B\'");
					String letter = key.next();
					
					if(letter.equalsIgnoreCase("A"))
					{
						System.out.println("The beetle turned into a prince! He thanked you and agreed to send you home.");
						System.exit(0);
					}
					else if(letter.equalsIgnoreCase("B"))
					{
						System.out.println("The beetle escaped and ran away, you remain lost in the forest.");
						System.exit(0);
					}
					
				}
				else if(num ==2)
				{
					System.out.println("You have selected the number: 2\nNow enter \'A\' or \'B\'");
					String letter = key.next();
					
					if(letter.equalsIgnoreCase("A"))
					{
						System.out.println(" A hawk came down and ate your beetle friend, you are now sad");
						System.exit(0);
					}
					else if(letter.equalsIgnoreCase("B"))
					{
						System.out.println("The beetle gave you food to eat. It wasn'tgood but you survived!");
						System.exit(0);
					}
			else
			{
					System.out.println("Invalid number inputed now exiting!");
					System.exit(0);
			}
		
		}
	  }
	}
		//timeless swamp code. if string is entered, the computer will run the timeless swamp code.

		
	
		 if(response.equalsIgnoreCase("Fairy Village"))
		{
			
			System.out.println("Welcome to the Fairy Village! Make the right decision approaching! You see a Blue Fairy, a Pink Fairy, nd a Purple Fairy. Which one will you talk to \'blue\', or \'pink\' or \'purple\':");
			
			response = key.nextLine();
			
		 if(response.equalsIgnoreCase("blue"))
		{
			System.out.println("You selected the Blue Fairy! Now choose a number between 1 and 2");
			int num = key.nextInt();
			
			
			if(num == 1)//numeric comparison
			{
				System.out.println("You have selected the number: 1\n A. Would you like to compliment her? or  B. Ask for her help? Enter letter \'A\' or \'B\'");
				String letter = key.next();
				//letter = key.next();
				
				if(letter.equalsIgnoreCase("A"))
				{
					System.out.println("The Blue Fairy gave you wings! You can now fly home!");
					System.exit(0);
				}
				else if(letter.equalsIgnoreCase("B"))
				{
					System.out.println("The Blue Fairy gave you a potion. It was the wrong potion so you turned blue and died.");
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid number inputed now exiting!");
					System.exit(0);
				}
				
			}
		
			else if(num == 2)
			{
				System.out.println("You have selected the number: 2 \n A.Would you like to greet her? Or B.Yell at her? Enter \'A\'  or \'B\' ");
				String letter = key.next();
				
			
				if(letter.equalsIgnoreCase("A"))
				{
					System.out.println("The Blue Fairy was scared of you and turned you into a frog! You were eaten days later.");
					System.exit(0);
				}
				else if(letter.equalsIgnoreCase("B"))
				{
					System.out.println("The Blue Fairy was evil and turned you into a worm. You died of natural causes.");
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid number inputed now exiting!");
					System.exit(0);
				}
			}
		}
		
			else if(response.equalsIgnoreCase("pink"))
			{
				System.out.println("You selected the Pink Fairy! Now choose a number between 1 and 2");
				int num = key.nextInt();
				
				if(num == 1)
				{
					System.out.println("You have selected the number: 1\n A. Would you like to ask for a spell or B. Tap on her shoulder to gain her attention? Enter letter \'A\' or \'B\'");
					String letter = key.next();
					
					if(letter.equalsIgnoreCase("A"))
					{
						System.out.println("The Pink Fairy casted a glitter spell that took you home");
						System.exit(0);
					}
					else if(letter.equalsIgnoreCase("B"))
					{
						System.out.println("You accidentally and pushed her into a trap. The Pink Fairy can no longer help you get home.");
						System.exit(0);
					}
					
				}
				else if(num ==2)
				{
					System.out.println("You have selected the number: 2\n A. Would you like to ask her for help? or B. Insult her? Enter letter \'A\' or \'B\'");
					String letter = key.next();
					
					if(letter.equalsIgnoreCase("A"))
					{
						System.out.println("The Pink Fairy granted your wishes and took you home!!!");
						System.exit(0);
					}
					else if(letter.equalsIgnoreCase("B"))
					{
						System.out.println("You insulted the Pink Fairy! She turned you into swamp mud.");
						System.exit(0);
					}
				}
			}
		 else if(response.equalsIgnoreCase("purple"))
			{
				System.out.println("You selected the Purple Fairy! Now choose a number between 1 and 2");
				int num = key.nextInt();
				
				if(num == 1)
				{
					
					System.out.println("You have selected the number: 1\n A. Ask the fairy for a transformation spell? Or B. Talk about the color purple? Enter letter \'A\' or \'B\'");
					String letter = key.next();
					
					if(letter.equalsIgnoreCase("A"))
					{
						System.out.println("The Purple Fairy turned you into a bird! You flew home and the spell wore off!");
						System.exit(0);
					}
					else if(letter.equalsIgnoreCase("B"))
					{
						System.out.println("You told the Purple Fairy you hated the color purple. She teleported you into a cave and you remain lost forever.");
						System.exit(0);
					}
					
				}
				else if(num ==2)
				{
					System.out.println("You have selected the number: 2\n A. Ask the fairy for a transformation spell or B. Ask for a potion? Enter letter \'A\' or \'B\'");
					String letter = key.next();
					
					if(letter.equalsIgnoreCase("A"))
					{
						System.out.println(" The Purple Fairy turned you into a snake! You were eaten by a bird");
						System.exit(0);
					}
					else if(letter.equalsIgnoreCase("B"))
					{
						System.out.println("The Purple Fairy gave you a potion that sent you home!");
						System.exit(0);
					}
			else
			{
					System.out.println("Invalid number inputed now exiting!");
					System.exit(0);
				}
					////fairy village code. if string is entered, the computer will run the fairy village code.
		
			   }
			}
		}
	}
}
