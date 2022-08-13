
public class PalindromeOrNotDemo {
	public static void main(String[] args) {

		String word = "repaper";// 9/2=4
		String left;
		String right;
		int mid = word.length() / 2;
		if (mid % 2 == 0) {// check if the remainder is zero the mid is even 
			left = word.substring(0, mid);
			right = word.substring(mid, word.length());
			

		} else {//its odd number
			left = word.substring(0, mid);
			right = word.substring(mid + 1, word.length());
		}
		String str = "";

		for (int i = right.length() - 1; i >= 0; i--) {
			str += right.charAt(i);
			// System.out.print(result);
		}
		if (left.equals(str)) {
			System.out.println("the given string is a palindrome sequence");
		} else
			System.out.println("the given string is not a palindrome sequence");

	}
}
