//to calculate the sum of the numbers appear in a given string. 
package assignment2;

import java.util.Scanner;

public class NumbersInString {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		int sum =0;
		System.out.println("enter the string :");
		String str = input.nextLine();
		
		for(int i = 0; i<str.length(); i++) 
		{
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') 
			{
				
				sum+=str.charAt(i);
			}
		}
			System.out.println(sum);
	}

}
