package computer.science;

import java.util.Scanner;

public class Solon_ifFollowingDirections {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double num;
		
		System.out.print("Enter a number between 1 and 50: ");
		num = reader.nextDouble();
		reader.close();
		
		if ((num > 50) || (num < 1)){
			System.out.println("Number not between 1 and 50. You are now to be berated civilly.");
			return;
		}
		
		System.out.printf("The square root of %,.4f is %,.4f", num,(double)Math.sqrt(num));
	}

}
