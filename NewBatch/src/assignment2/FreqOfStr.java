//Java program to print the frequency of a character in a string
package assignment2;
import java.util.Scanner;

public class FreqOfStr 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the sentence :");
		 String str = input.nextLine(); 
		 
		 System.out.println("enter the character to know its frequency :");
		 char ch = input.next().charAt(0);

		 int count =0;
		 for(int i =0; i<str.length(); i++) {
			 
			 if(ch == str.charAt(i)) {
				count++;
			 }
		 }
		 System.out.println("the frequency of "+ ch + " is " + count);
	}

}
