import java.util.Scanner;
public class DecisionsGame {
//Kennedy Chisolm
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		//create new scanner key
		
		String contestant1Prize = "nothing";
		String contestant2Prize = "nothing";
		
		String markerPrize = "a red marker";
		String deskPrize = "a black pen";
		String bagPrize = "a Kit-Kat";
		
		System.out.println("Contestant 1: I will give you this marker. Would you like to keep it or trade it with what\'s on my desk or what\'s in my bag." 
				+ "\"Enter \"keep\", \"desk\", or \"bag\":");
		
		String response = key.next();
		
		if(response.equalsIgnoreCase("desk"))
				{
					contestant1Prize = deskPrize;
					
					System.out.println("Contestant 2: Would you like to keep the marker or trade it with what\'s in my bag. Enter \"keep\", or \"bag\":");
					
					response = key.next();
				
		
		
					if(response.equalsIgnoreCase("bag"))
					{
						contestant2Prize = bagPrize;
					}
						else if(response.equalsIgnoreCase("marker"))
						{
							contestant2Prize = markerPrize;
						}
						else
						{
							System.out.println("You got nothing!");
						}
				}
					
				
		 	if(response.equalsIgnoreCase("keep"))
		 		
		 	{
			contestant1Prize = markerPrize;
			System.out.println("Contestant 2: Would you like to keep the marker or trade it with what\\'s in my bag. Enter \"desk\", or \"bag\":");
			
			response = key.next();
		
			if(response.equalsIgnoreCase("desk"))
			{
				contestant2Prize = deskPrize;
			}
			else if(response.equalsIgnoreCase("bag"))
			{
			contestant2Prize = bagPrize;	
			}
			else
			{
				System.out.println("You got nothing!");
			}
			
		}
		else if(response.equalsIgnoreCase("bag"))
		{
			contestant1Prize = bagPrize;
			
			System.out.println("Contestant 2: Would you like to keep the marker or trade it with what\'s in my bag. Enter \"keep\", or \"desk\":");
			
			response = key.next();
		}
			
			if(response.equalsIgnoreCase("keep"))
			{
				contestant2Prize = markerPrize;
				
			}
			else if(response.equalsIgnoreCase("desk"))
			{
				contestant2Prize = deskPrize;
				
			}
			else
			{
				System.out.println("You got nothing!");
			}
			System.out.println("Contestant 1 gets " + contestant1Prize);
			System.out.println("Contestant 2 gets " + contestant2Prize);
			
		}
		
	}


