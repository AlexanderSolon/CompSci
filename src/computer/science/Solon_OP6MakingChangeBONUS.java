// Solon_OP6MakingChangeBONUS.java
// Alexander C. Solon
// Calculate change due for a purchase (using modulus for bonus points)
package computer.science;

import java.util.Scanner;

public class Solon_OP6MakingChangeBONUS {
	public static void main( String[] args ) {
		// Initialize a new scanner
		Scanner InputReader = new Scanner( System.in );
		
		// Variables
		double purchasePrice, moneyReceived, changeDue;
		int dollars, quarters, dimes, nickels, pennies;
		
		// Get the purchase price
		System.out.print( "Enter the purchase price: " );
		purchasePrice = InputReader.nextDouble();
		
		// Get the amount of money received
		System.out.print( "Enter the amount received: " );
		moneyReceived = InputReader.nextDouble();
		
		// Calculate and print the change due
		changeDue = moneyReceived - purchasePrice;
		System.out.printf( "Change due back: $%.2f", changeDue);
		
		// Blank Line
		System.out.println();
		
		// Calculate and print the amount of dollars owed
		dollars = (int)changeDue / 1;
		System.out.println( "Dollars: " + dollars );
		
		// Get remaining change due
		changeDue = changeDue % 1;
		
		// Calculate and print the amount of quarters owed
		quarters = (int)( changeDue / .25 );
		System.out.println( "Quarters: " + quarters );
		
		// Get remaining change due
		changeDue = changeDue % .25;
		
		// Calculate and print the amount of dimes owed
		dimes = (int)( changeDue / .10 );
		System.out.println( "Dimes: " + dimes);
		
		// Get remaining change due
		changeDue = changeDue % .10;
		
		// Calculate and print the amount of nickels owed
		nickels = (int)( changeDue / .05 );
		System.out.println( "Nickels: " + nickels );
		
		// Get remaining change due
		changeDue = changeDue % .05;
		
		// Calculate and print the amount of pennies owed
		pennies = (int)( changeDue / .01 );
		System.out.println( "Pennies: " + pennies );
		
		// Close the stream for InputReader
		InputReader.close();
	}
}
