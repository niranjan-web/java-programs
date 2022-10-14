
public class FindingSpecialCharacters {
	public static void main(String[] args) {
		String string = "*n$asj$#@";
		System.out.println(method(string));
		
	}
	public static String method(String string)
	{
		int count = 0;
		String str = "";
		for(int i = 0; i<string.length(); i++)
		{
			char ch = string.charAt(i);
			if(!Character.isDigit(ch) && !Character.isWhitespace(ch) && !Character.isLetter(ch))
			{
				count++;
			}
			else
				str+=string.charAt(i);
		}
		System.out.println(str);
		if(count == 0)
		{
			return "there are no special character";
			
		}
		else
			return "special character found " + count;	
		}
	

}
