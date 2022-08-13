// to print after removing duplicates from a given string.
package assignment2;

import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the string :");
	    String str = input.nextLine();
	    String str1 = "";
	    
	    for(int i =0; i<str.length(); i++) {
	    	
	     char ch = str.charAt(i);
	     int num = str1.indexOf(ch);    //to check ch is available in str1 or not
	     if(num == -1) {
	    	 str1+=ch;
	     }
	    }
	    System.out.println("after removing duplicate :"+ str1);
		
	}

}
