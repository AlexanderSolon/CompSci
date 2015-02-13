// Solon_OP2UsingPi.java
// Alexander C. Solon
// Calculate some information using PI
package computer.science;

import java.util.Scanner;

public class Solon_OP2UsingPi {
	public static void main( String[] args ){
		// Initialize a new scanner
		Scanner InputReader = new Scanner( System.in );
		
		// Variables
		final double PI = 3.14159;
		double radius, area, circumference, volume, surfaceArea;
		
		// Get the radius from the user
		System.out.print( "Enter radius: " );
		radius = InputReader.nextDouble();
		
		// Calculate the area, circumference, volume, and surface area
		area = PI * Math.pow( radius, 2 );
		circumference = 2 * PI * radius;
		volume = ( (double)( 4/3 ) ) * PI * Math.pow( radius, 3 );
		surfaceArea = 4 * PI * Math.pow( radius,2 );
		
		// Print out the properties of a circle with a radius of the given number
		System.out.println( "Propeties of circle with a radius of " + radius + ":" );
		System.out.println(" Area = " + area + "\nCircumference = " + circumference 
				+ "\nVolume = " + volume + "\nSurface Area: " + surfaceArea );
		
		// Close the stream for InputReader
		InputReader.close();
	}
}