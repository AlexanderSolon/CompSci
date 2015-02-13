package computer.science;

import java.util.Scanner;

public class Solon_ifDivisor {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		int x,y;
		
		System.out.print("Enter a number: ");
		x = reader.nextInt();
		
		System.out.print("Enter a divisor: ");
		y = reader.nextInt();
		
		if ((x % y) != 0){
			System.out.printf("%,d/%,d is not even.\n", x, y);
		}else{
			System.out.printf("%,d/%,d is even and equals %d", x, y, x/y);
		}
		
		reader.close();
	}
	
}
