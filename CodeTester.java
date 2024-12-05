import java.util.Scanner;
public class CodeTester {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Plkease enter a number");
		
		int number = key.nextInt();
		int 
		
		if(number < 5)
		{
		System.out.println("A");
		}
		else if(number < 100 && number > 5)
		{
		System.out.println("B");
		}
		else if (number < 20)
		{
		System.out.println("C");
		}
		
		else
		{
		System.out.println("D");
		}
		if(number > 1 || number <=5)
		{
		System.out.println("E");
		}
		else if(number > 2 && number <=40)
		{
		System.out.println("F");
		}
		else
		{
		System.out.println("G");
		}
	
		
	}

}
