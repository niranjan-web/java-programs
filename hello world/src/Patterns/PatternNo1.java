package Patterns;

public class PatternNo1 {
	public static void main(String[] args) {
		pattern1(5);
	}
	
	static void pattern3(int n)
	{
		for (int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=n-i+1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n)
	{
		for (int i = 0; i<n; i++)
		{
			for(int j = 1; j<=n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern1(int n)
	{
		for (int i=1;i<=n; i++)
		{
			for(int col = 1; col<=i; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
