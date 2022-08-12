public class Recursion {
	public static void main(String[] args) {
		//System.out.println(method(10));
		
		int num=1;
		int num1=2;
		
		while(num!=0)
		{
			System.out.println(8);
			break;
		}
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
