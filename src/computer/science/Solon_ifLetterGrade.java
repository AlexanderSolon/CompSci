package computer.science;

import java.util.Scanner;

public class Solon_ifLetterGrade {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		int grade;
		
		System.out.print("Enter your grade (0-100): ");
		grade = reader.nextInt();
		
		if ((grade < 0) || (grade > 100)){
			System.out.println("Please enter a number between 0 and 100.");
		}
		
		if (grade >= 90){
			System.out.println("You got an A");
		}else if(grade >= 80){
			System.out.println("You got a B");
		}else if (grade >= 70){
			System.out.println("You got a C");
		}else if (grade >= 60){
			System.out.println("You got a D");
		}else{
			System.out.println("You got a F!");
		}
		
		reader.close();
	}
	
}
