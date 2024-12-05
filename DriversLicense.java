import java.util.Scanner;
//predefined set of classes, that has methods we will use aka Java Package
public class DriversLicense {
	
	public static final int MIN_AGE = 16;

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter your age(in years): ");
		
		int age = key.nextInt();
		
		if (age <0) 
		{
			System.out.println("Invalid age entered. Exiting the program! ");
			
			System.exit(0);
		}
		
		if(age>= MIN_AGE)
		{
			System.out.println("You are eligible to drive! ");
		}
		else
		{
			int waitTime = MIN_AGE - age; 
			
			System.out.println("You will have to wait another " + waitTime + " years to be eligible for a driver\'s license!");
		}
		

	}

}