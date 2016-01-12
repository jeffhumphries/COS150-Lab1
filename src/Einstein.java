package src;
import java.util.Scanner;
import java.math.*;

public class Einstein {


	public static void main(String[] args) {
		final double light = 299792458.0;
		String origin, origin2;
		String destination;
		double velocity;
		double distance;
		double gamma;
		double roundTripTime;
		double age_diff;
		double mph;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to my Einstein Calculator!\n");

		System.out.print("Enter the origin star system: ");
		origin = input.nextLine();
		
		System.out.print("Enter the destination star system: ");
		destination = input.nextLine();
		
		System.out.print("Enter travel velocity as fraction of speed of light: ");
		velocity = input.nextDouble();
		
		System.out.print("Enter distance between the two systems in light years: ");
		distance = input.nextDouble();
		
		System.out.println("Traveling from " + origin + " to " + destination);
		
		gamma = GetTimeDialationFactor(velocity);
		System.out.print("Time dilation factor: ");
		System.out.println(gamma);
		
		roundTripTime = GetRoundTripTravelTime(distance, velocity );
		System.out.print("Round trip travel time: ");
		System.out.println(roundTripTime);
		
		age_diff = GetAgeDifference(roundTripTime, gamma);
		System.out.print("When you return, you will have aged ");
		System.out.println(age_diff + " years less.");
		System.out.println("");
		
		
	}
    
    public static double GetTimeDialationFactor(double velocity) {
    	return 0;
    }
    
    public static double GetAgeDifference(double travelTime, double timeDialationFactor) {
    	return 0;
    }

    public static double GetRoundTripTravelTime(double distance, double velocity) {
    	return 0;
    }
    
}
