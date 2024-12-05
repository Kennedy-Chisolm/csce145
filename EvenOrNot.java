import java.util.Scanner;
public class EvenOrNot {
//Kennedy Chisolm
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		//type casting
		int number = (int) key.nextDouble();		// putting (int) turns it into a an int no matter what the put in
		
		if(number % 2 == 0)
		{
			System.out.println("Number entered is even!");
		}
		else
		{
			System.out.println("Number entered is odd: ");
		}
		
		//Most recent variable will replace old one
		int a = 10;
		
		System.out.println(a);
		
		a = 15;
		
		System.out.println(a);
		
		
		
	}

}
