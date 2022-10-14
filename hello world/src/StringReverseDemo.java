
public class StringReverseDemo {

	public static void main(String[] args) {
		String str = "niranjan";
		
		char ch = 0;
		for(int i=str.length(); i>=0; i--)
		{
			  ch = str.charAt(i);
		}
		System.out.println(ch);
	}

}
