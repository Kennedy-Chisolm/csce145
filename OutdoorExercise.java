import java.util.Scanner;
public class OutdoorExercise {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the temperature(In Farenheit): ");
		
		int temperature = key.nextInt();
		
		if(temperature < -144 || temperature > 134 )
		{
			System.out.println("Invalid temperature entered for Planet Earth!");
			
			System.exit(0);
		}
		else if (temperature >= 40 && temperature < 71)
		{
			System.out.println("Temperature is too cold!");
			
		} 
		else if ( temperature>= 71 && temperature <77)
		{
			System.out.println("Temperature is ideal for outdoor excercise!");
		}
		else if (temperature >= 98 && temperature < 111)
		{
			System.out.println("Temperature is too hot!");
		}
		else 
		{
			System.out.println("Temperature unsuitable for outdoor excercise!");
		
		}
		/*
		 * 40-70- too cold
		 * 71-76 - just right
		 * 98-110- too hot
		 */
		

	}

}
