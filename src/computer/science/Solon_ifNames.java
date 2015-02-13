package computer.science;

import java.util.Scanner;

public class Solon_ifNames {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		final String mFirst = "alex";
		final String mLast = "solon";
		String hFirst, hLast;
		
		System.out.print("Enter your first name: ");
		hFirst = reader.nextLine().toLowerCase();
		
		System.out.print("Enter your last name: ");
		hLast = reader.nextLine().toLowerCase();
		
		if (mFirst.equals(hFirst)){
			if (mLast.equals(hLast)){
				System.out.println("We have the same first and last name.");
			}else {
				System.out.println("We only have the same first name.");
			}
		}else if(mLast.equals(hLast)){
			System.out.println("We only have the same last name.");
		}else {
			System.out.println("We do not have the same first or last names.");
		}
		
		reader.close();
	}
	
}
