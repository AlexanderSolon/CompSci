package computer.science;

import java.util.Scanner;

public class Solon_ifGuessANumber {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		final int sec_num = 5; // SECRET NUMBER
		int guess;
		
		System.out.print("Guess!! (1-20): ");
		guess = reader.nextInt();
		
		if ((guess < 1) || (guess > 20)){
			System.out.println("Must be between 1 and 20");
		}else{
			if (guess == sec_num){
				System.out.println("Correct!");
			}else{
				if (Math.abs(guess - sec_num) <= 2){
					System.out.println("Incorrect, but a good guess.");
				}else{
					System.out.println("Incorrect, and a lousy guess.");
				}
			}
		}
		
		reader.close();
	}
	
}
