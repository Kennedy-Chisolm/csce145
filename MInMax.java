import java.util.Scanner;
public class MInMax {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		
		int size = key.nextInt();
		
		//create an array
		int [] myArray = new int[size];
		
		for (int i = 0; i < myArray.length; i++)

		{
			System.out.println("Enter the value of the array at index: " + i + ":");
			
			myArray[i] = key.nextInt();
			
			
		}
		double sum = 0;
		int min = myArray[0];
		int max = myArray[0];
		
		
		for(int i = 0; i< myArray.length; i++)
		{
			if(myArray[i]< min)
			{
				min = myArray[i];
				
			}
			if(myArray[i] > max)
			{
				max = myArray[i];
			}
			
			sum+=myArray[i];	//sum = sum + myArray[i]
			
		}
			double average = sum/size;
			
			System.out.println("Minimum value = " + min + "\nMaximum value = " + max + "\nAverage value = " + average);
	}	

}
