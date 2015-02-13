// Solon_OP1SpeedingFines.java
// Alexander C. Solon
// Calculate the speeding fines for a ticket
package computer.science;

import java.util.Scanner;

public class Solon_OP1SpeedingFines {
	public static void main( String[] args ){
		// Initialize a new scanner
		Scanner InputReader = new Scanner( System.in );
		
		// Variables
		final int FIXED_FINE = 20;
		int driverSpeed, speedLimit, fineTotal;
		
		// Get the speed limit
		System.out.print( "Enter the speed limit: " );
		speedLimit = InputReader.nextInt();
		
		// Get the speed of the driver
		System.out.print( "Enter the speed of the driver: " );
		driverSpeed = InputReader.nextInt();
		
		// Calculate the total for the fine
		fineTotal = FIXED_FINE + ( ( driverSpeed - speedLimit ) * 5 );
		
		// Print out the total for the fine
		System.out.println("The drivers fine would be a total of $" + fineTotal);
		
		// Close the stream for InputReader
		InputReader.close();
	}
}
