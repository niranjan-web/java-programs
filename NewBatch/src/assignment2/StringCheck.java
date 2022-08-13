// to check whether the character immediately before and after a specified character is same in a given string.
package assignment2;
import java.util.Scanner;
public class StringCheck 
{
	public static void main(String[] args) 
	{
		Scanner input  = new Scanner(System.in);
		
		System.out.println("enter the the string to check :");
		String str = input.nextLine();
		
		  for (int i = 0; i < str.length(); i++) 
		  {
			    char ch = str.charAt(i);
			    if (ch =='#') 
				{
			      if (str.charAt(i-1) == str.charAt(i+1)) 
			      {
					  System.out.println("the character before the and after # are same");
			      }
			      else
			        {
					  System.out.println("the character before and after # are not same");
			      		break;
			      	}
				}
		  }
	}

}
