package datastructure;

public class Recursion {
	public static void main(String[] args) {
		System.out.println(method(1000));
	}
	
	public static int method(int num)
	{
		if (num ==0)
		{
			return 0;
		}
		
		return num+method(num-1);
		
		
	}
}
