import java.util.Arrays;

public class StringSeparationDemo {

	public static void main(String[] args) {
		String name = "niranjan";
		int mid = name.length()/2;
		
		String leftString = name.substring(0, mid);
		String rightString = name.substring(mid,name.length());
		
		//System.out.println(leftString + " "+rightString);
		System.out.println(method("niranjan"));;;;;
		
	}
	
	public static String method(String name)
	{
		char chArr[] = name.toCharArray();
		
		int mid = chArr.length/2;
		
		char[] left = Arrays.copyOfRange(chArr, 0, mid);
		char[] right = Arrays.copyOfRange(chArr, mid, chArr.length);
		
		String leftResult = new String(left);
		String rightResult = new String(right);
		return  leftResult + " " +  rightResult;
	}

}
