 //to count the number of words ending in 'm' or 'n' (not case sensitive) in a given text.
package assignment2;

public class CountWordsEnd {

	public static void main(String[] args) {
		String str = "man is in the room";
		
		int count =0;
		for (int i = 0; i < str.length(); i++)
        {
            if(str.endsWith("m") || str.endsWith("n")) {
            	count++;
            }
		
	}
		System.out.println(count);

}
}