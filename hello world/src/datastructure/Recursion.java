package datastructure;

public class Recursion {
	public static void main(String[] args) {
		//System.out.println(factorial(9));
		//System.out.println(add(1));
		
	}
	
	public static int factorial(int num)
	{
		if (num ==0)
		{
			return 0;
		}
		
		return num+factorial(num-1);
		
		
	}
	public static int add(int num)
	{
		if (num == 10)
		{
			return 0;
		}
		
		return num+add(num+1);
	}
	

}
