package assignment2;

import java.util.Scanner;

public interface ToUpperCase {
	public static void main(String arguments[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the string:");
		String sen1 = input.nextLine();
		System.out.println("the entered string is :"+sen1);
		
		for(int i =0; i<sen1.length();) {
			
			if(sen1.charAt(i)>='A' && sen1.charAt(i)<='Z') {
				System.out.println("the converted string is :"+ sen1.toLowerCase());
				break;
			}else
				System.out.println("the converted string is :"+sen1.toUpperCase());
			break;
		}
	}
}
