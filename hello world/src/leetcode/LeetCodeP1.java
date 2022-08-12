package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeP1 {
	
	public static void main(String[] args) {
		
		    System.out.println(romanToInt("XII"));
		
	
	}
	public static int romanToInt(String romanLetter) {
//		static int value(char r)
//		{
//			if (r == 'I')
//				return 1;
//			if (r == 'V')
//				return 5;
//			if (r == 'X')
//				return 10;
//			if (r == 'L')
//				return 50;
//			if (r == 'C')
//				return 100;
//			if (r == 'D')
//				return 500;
//			if (r == 'M')
//				return 1000;
//			return -1;
//		}
//
//		// Finds decimal value of a
//		// given roman numeral
//		static int romanToInt(String str)
//		{
//			// Initialize result
//			int res = 0;
//
//			for (int i = 0; i < str.length(); i++) {
//				// Getting value of symbol s[i]
//				int s1 = value(str.charAt(i));
//
//				// Getting value of symbol s[i+1]
//				if (i + 1 < str.length()) {
//					int s2 = value(str.charAt(i + 1));
//
//					// Comparing both values
//					if (s1 >= s2) {
//						// Value of current symbol
//						// is greater or equalto
//						// the next symbol
//						res = res + s1;
//					}
//					else {
//						// Value of current symbol is
//						// less than the next symbol
//						res = res + s2 - s1;
//						i++;
//					}
//				}
//				else {
//					res = res + s1;
//				}
//			}
//
//			return res;
//		}
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        
        char[] charArr = romanLetter.toCharArray();
        
        for(int i=0 ; i<charArr.length-1 ; i++ )
            if(map.get(charArr[i])>=map.get(charArr[i+1]))
                sum+=map.get(charArr[i]);
            else
                sum-=map.get(charArr[i]);
        
        return sum+ map.get(charArr[charArr.length-1]);  // last Char was not added in the loop, because it would have produced out of bounds exception 
       
	} 

}
