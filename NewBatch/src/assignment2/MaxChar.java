//program for maximum ocuuring character in a string
package assignment2;
import java.util.Scanner;
public class MaxChar {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the string :");
		String str = input.nextLine();
		System.out.println();
	    System.out.println("The given string is: " + str);

	        int charCount = 0;
	        char maxOccurCh = ' ';
	        for (int i = 0; i < str.length(); i++)
	        {
	            int count = 0;
	            for (int j = 0; j < str.length(); j++)
	            {
	                if (str.charAt(i) == str.charAt(j)) 
	                {
	                    count++;
	                }
	            }
	            if (charCount < count) 
	            {
	                charCount = count;
	                maxOccurCh = str.charAt(i);
	            }
	        }
	        System.out.println("Max occurring character in the given string is: " + maxOccurCh+ "("+charCount+")"+"times");

	}

}
