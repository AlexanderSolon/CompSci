package computer.science;

import java.util.Scanner;

public class Solon_ifIsItBigger {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Enter a number: ");
		x = reader.nextInt();
		
		System.out.print("Enter another number: ");
		y = reader.nextInt();
		
		if (x > y){
			System.out.printf("First is bigger. %,.4f", Math.pow(x, y));
		}else if(x < y){
			System.out.printf("Second is bigger. %,.4f", Math.sqrt(x*y));
		}else{
			System.out.printf("Equal. %,.4f", Math.pow(2, x*y));
		}
		
		reader.close();
	}

}
