// Solon_OP4Calculator.java
// Alexander C. Solon
// Calculate various information for two numbers
package computer.science;

import java.util.Scanner;

public class Solon_OP4Calculator {
	public static void main( String[] args ) {
		// Initialize a new scanner
		Scanner InputReader = new Scanner( System.in );
		
		// Variables
		int firstInput, secondInput, difference, sum, product;
		double average;
		
		// Get the first number from the user
		System.out.print( "Enter the first number: " );
		firstInput = InputReader.nextInt();
		
		// Get the second number from the user
		System.out.print( "Enter the second number: " );
		secondInput = InputReader.nextInt();
		
		// Calculate the sum, product, difference, and average of the two numbers
		sum = firstInput + secondInput;
		product = firstInput * secondInput;
		difference = firstInput - secondInput;
		average = ( (double)( firstInput + secondInput ) ) / 2;
		
		// Print out the sum, product, difference, and average of the two numbers
		System.out.println( "Sum         " + sum );
		System.out.println( "Difference  " + difference );
		System.out.println( "Product     " + product );
		System.out.printf( "Average     %.4f", average );
		
		// Close the stream of InputReader
		InputReader.close();
	}
}
