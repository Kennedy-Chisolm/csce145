import java.util.Scanner;
public class Lab05 {
//Kennedy Chisolm
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		//Scanner key
		System.out.println("How many dollars would you like to spend on chocolate bars: ");
		//prompts the user 
		int chocolateBar= key.nextInt();
		//accept a number from the user
		if(chocolateBar<0)
		{
			System.out.println("Invalid input! Now exiting the program");
			System.exit(0);
		}
		if(chocolateBar%6==0)
		{

			//Initialization section, i belongs to the loop,
		for(int i = chocolateBar; i>= 0;)// number of chocolate bars(if the number is not divisible by 6) that can be purchased with a coupon and money displayed 
		{
			System.out.print("You can purchase $" +(chocolateBar) + " of chocolate");
			
			if(i%6==0)//number of choclate bars desired to purchase and if coupons can be used
			{
				System.out.print("\nYou have " + chocolateBar/6 + " coupons for bars of chocolate\nFor a total of " 
			+ (chocolateBar+(chocolateBar/6)) + " chocolate bars!");
				System.exit(0);
			}
			System.out.println();
		}
		

	}
		else if(chocolateBar%6!=0) //number of chocolate bars(if the number is not divisible by 6) that can be purchased with a coupon and money displayed
		{
			System.out.print("You can purchase $" +(chocolateBar) + " of chocolate");
			System.out.print("\nYou have " + chocolateBar/6 + " coupons for bars of chocolates\nFor a total of " 
					+ (chocolateBar+(chocolateBar/6)) + " chocolate bars!");
			
		}
		
	}

}
