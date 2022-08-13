//program to find the given string is palindrome or not
package assignment2;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the sentence :");
		String str = input.nextLine();
		String str1 ="";
		
		for(int i =str.length()-1; i>=0; i--) //for reversing
		{																																						//		boolean flag =true;
	        str1+=str.charAt(i);				//store the reverse string																																									//		
		}																																											//		for(int i = 0; i< counter/2; i++) {
				if(str.equals(str1)) 
				{
					  System.out.println("the entered string is a palindrome!");																																										//			if(ch[i] == ch[counter--]) {
				}else {
					System.out.println("the entered string is not a palindrome!");
				}
		
	}

}
