//to count how many times the substring 'life' present at anywhere in a given string. 
package assignment2;

public class SubString {

	public static void main(String[] args) {
			
		String str = "liveonwildlife";
		
		  int count = 0;
		  for (int i = 0; i < str.length() - 3; i++) 
		  {
			  String str1 = str.substring(i,i+2);
			  String str2 = str.substring(str.length()-1);
		    if (str1.compareTo(str1) == 0 ) 
		    {
		    	if(str2.compareTo(str.substring(i+3, i+4)) == 0) 
		    	{
		    		count++;
		    	}
		    }
		  }
		  System.out.println("number of times that substring present in the string is : "+ count);
	}

}
