//to compare two strings lexicographically, ignoring case differences
package assignment2;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the 1st sentence :");
		String sen1 = input.nextLine();
		
		System.out.println("enter the 2nd sentence :");
		String sen2 = input.nextLine();
		
		
		boolean output = sen1.equalsIgnoreCase(sen2);
		if(output == true) {
			System.out.println("the entered two strings are equal!");
		}else {
			System.out.println("the entered two strings are not equal! ");
		}
		
	}

}
