package practice;

public class StarPatternDemo {
	public static void main(String[] args) {
//		for(int i=0;i<10;i++)
//		{
//			
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print(" *");
//			}System.out.println();
//		}
		String name = "niranjan";
		boolean result = Palindrome.method(name);
		System.out.println(result);
	}
}

class Palindrome
{
	
	static String reverse = "";
	public static boolean method(String name)
	{
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse +=name.charAt(i);
		}
		if(name.equals(reverse))
		{
			return true;
		}
		else 
			return false;
	}
}