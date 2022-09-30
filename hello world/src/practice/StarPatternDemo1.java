package practice;

import java.io.IOException;
import java.util.Scanner;

public class StarPatternDemo1 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		 for(int i=1; i<=num; i++)
		 {
			 for(int j=num; j>=i; j--)   //made changes here
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 scan.close();
	}

}
