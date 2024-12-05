import java.util.Scanner;
public class Lab03 {
	///Kennedy Chisolm
	public static final int SOFT_PACKAGE = 99; 
	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		//creating scanner key 
		System.out.println("Welcome! Please enter the quantity of packages you would like to purchase: ");
		
		int order = key.nextInt();
		//object that will store the users inputs of number of packages needed
		if(order <= 0)
		{
			System.out.println("That is an invalid number or packages ordered. Now exiting the program. ");
			System.exit(0);
		}
		else if(order >= 1 && order <=9) 
		{
			System.out.println("Your total discount is 0%");
			System.out.println("Your total bill before discount is $" + (SOFT_PACKAGE * order));
			System.out.println("Your total bill after discount is $" + (SOFT_PACKAGE * order));
			//no discount!
		}
		else if(order >= 10 && order <=19) 
		{
			System.out.println("Your total discount is 20%"); //+ "(" + ((SOFT_PACKAGE * order) * .40) +")");
			System.out.println("Your total bill before discount is $" + (SOFT_PACKAGE * order));
			System.out.println("Your total bill after discount is $" + ( (SOFT_PACKAGE * order)- ((SOFT_PACKAGE * order) * .20) ));
			//20% discount
		}
		else if(order >= 20 && order <=49) 
		{
			System.out.println("Your total discount is 30%" );//+ "(" + ((SOFT_PACKAGE * order) * .40) +")");
			System.out.println("Your total bill before discount is $" + (SOFT_PACKAGE * order ));
			System.out.println("Your total bill after discount is $" + ( (SOFT_PACKAGE * order)-((SOFT_PACKAGE * order)* .30 )));
			//30% discount
		}
		else if(order >= 50 && order <=99) 
		{
			System.out.println("Your total discount is 40%"); //+ "(" + ((SOFT_PACKAGE * order) * .40) +")");
			System.out.println("Your total bill before discount is $" + (SOFT_PACKAGE * order ));
			System.out.println("Your total bill after discount is $" + ( (SOFT_PACKAGE * order)-((SOFT_PACKAGE * order) * .40 ) ));
			//40% discount
		}
		else if (order >= 100 ) 
		{
			System.out.println("Your total discount is 50%"); // "(" + ((SOFT_PACKAGE * order) * .40) +")");
			System.out.println("Your total bill before discount is $" + (SOFT_PACKAGE * order ));
			System.out.println("Your total bill after discount is $" + (( (SOFT_PACKAGE * order)-((SOFT_PACKAGE * order)*.50 ))));
			//50% discount
		}
		else
		{
			System.out.println("Have a great day!");
			//System.exit(0);
			//ends the if-else block
		}
		//if else block determines which lines need to be run depending on what the user inputs
	}

}
