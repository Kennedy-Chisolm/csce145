import java.util.Scanner;

public class Lab02 {
	/* Kennedy Chisolm
	velocity= u	time= t	distance= s	final velocity = v acceleration = a
	 volume = u+at
	 * 
	 */
public static final double ACCELERATION_DUE_TO_GRAVITY = 9.8;
public static final double VALUE = 0.5;
//final method to establish accelerations need to remain constant

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		//new scanner object to allow inputs
		
		System.out.println("Please Enter initial velocity of the ball(in meters per second) at point A: ");
		double intveloc = key.nextDouble();
		
		System.out.println("Thank you! Please Enter the time(in seconds) the ball took to reach point B: ");
		double time = key.nextDouble();
		
		double finvelocity = intveloc + ACCELERATION_DUE_TO_GRAVITY * time;
		
		double distance = (intveloc * time) + ((ACCELERATION_DUE_TO_GRAVITY * Math.pow(time, 2)) * VALUE);
//creating the formulas for distance and final velocity
		
		System.out.println("Final velocity of the ball = " + finvelocity + " m/s");
		System.out.println("Distance traveled by the ball (S) = " + distance + " meters");
		
		//Formulas I may need:
		//d= 1/2 a t^2 +v(0) t _ d(0)
		//v=a T + v(0)
	}

}
