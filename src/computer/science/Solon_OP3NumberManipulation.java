// Solon_OP3NumberManipulator.java
// Alexander C. Solon
// Number manipulation program
package computer.science;

import java.util.Scanner;

public class Solon_OP3NumberManipulation {
	public static void main( String[] args ) {
		// Initialize a new scanner
		Scanner InputReader = new Scanner( System.in );
		
		// Variables
		int firstValue, secondValue, userInput;
		
		// Get a number from the user
		System.out.print( "Enter a number: " );
		userInput = InputReader.nextInt();
		
		// Manipulate the numbers according to the papers specifications
		firstValue = userInput * 9;
		secondValue = firstValue * 12345679;
		
		// Print out the information regarding the manipulated numbers
		System.out.println( "              " + userInput );
		System.out.println( "X             9" );
		System.out.println( "---------------" );
		System.out.println( "             " + firstValue );
		System.out.println( "X      12345679" );
		System.out.println( "---------------" );
		System.out.println( "      " + secondValue );
		
		// Close the stream for InputReader
		InputReader.close();
	}
}
