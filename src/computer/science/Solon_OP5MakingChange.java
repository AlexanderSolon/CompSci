// Solon_OP5MakingChange.java
// Alexander C. Solon
// Calculate the amount of each coin to give back according to change due
package computer.science;

import java.util.Scanner;

public class Solon_OP5MakingChange {
	public static void main( String[] args ) {
		// Initialize a new scanner
		Scanner InputReader = new Scanner( System.in );
		
		// Variables
		double purchasePrice, moneyReceived, changeDue;
		int dollars, quarters, dimes, nickels, pennies;
		
		// Get the purchase price
		System.out.print( "Enter purchase price: " );
		purchasePrice = InputReader.nextDouble();
		
		// Get the amount of money received
		System.out.print( "Enter amount recieved: " );
		moneyReceived = InputReader.nextDouble();
		
		// Calculate and output the amount of change due
		changeDue = moneyReceived - purchasePrice;
		System.out.printf( "Change Due: $%.2f\n\n", changeDue );
		
		// Remove decimals from changeDue
		changeDue *= 100;
		
		// Calculate and print the amount of dollars to give back
		dollars = (int)changeDue / 100;
		System.out.println( "Dollars: " + dollars );
		
		// Remove the amount of dollars from changeDue
		changeDue -= dollars * 100;
		
		// Calculate and print the amount of quarters to give back
		quarters = (int)changeDue / 25;
		System.out.println( "Quarters: " + quarters );
		
		// Remove the amount of quarters from changeDue
		changeDue -= quarters * 25;
		
		// Calculate and print the amount of dimes to give back
		dimes = (int)changeDue / 10;
		System.out.println( "Dimes: " + dimes );
		
		// Remove the amount of dimes from changeDue
		changeDue -= dimes * 10;
		
		// Calculate and print the amount of nickels to give back
		nickels = (int)changeDue / 5;
		System.out.println( "Nickels: " + nickels );
		
		// Remove the amount of nickels from changeDue
		changeDue -= nickels * 5;
		
		// Calculate and print the amount of pennies to give back
		pennies = (int)changeDue;
		System.out.println( "Pennies: " + pennies );
		
		// Close the stream for InputReader
		InputReader.close();
	}
}
