
public class ReverseStringDemo {

	public static void main(String[] args) {
		String name = "niranjan";
		char []arr = name.toCharArray();
		
		int i= name.length()-1;
		char result;
//		while(i>=0)
//		{
//			 result = arr[i];
//			//System.out.print(result);
//			i--;
//		}
		//			8
		for(int j=0 ;j<name.length(); j++)
		{
			result = arr[j];
			System.out.print(result);
		}
	}

}
