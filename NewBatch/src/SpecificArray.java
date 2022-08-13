import java.util.Arrays;
import java.util.Scanner;

public class SpecificArray {

	public static void main(String[] args) {
		int arr[] = new int[]{45,7,8,90,32,34,2};
		System.out.println(Arrays.toString(arr));
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number to check wheather it in or not :");
		int numToCheck = input.nextInt();
		
         boolean check = false;
		for(int myArray :arr ){
			if(myArray == numToCheck){
		       // System.out.println(numToCheck +" is in the array");
		        check=true;
		        break;
		    }
		}System.out.println(check);
}
}