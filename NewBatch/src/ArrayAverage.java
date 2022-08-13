import java.util.Scanner;
public class ArrayAverage {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("enter the size of an array :");
    int num = input.nextInt();
    int result =0;
    int arr[] = new int[num];
    int average;
    
   for(int ctr=0; ctr<num; ctr++) {
	    System.out.println("enter the "+ ctr +" element");

	   arr[ctr]=input.nextInt();
    }
    for(int ctr1=0; ctr1<num; ctr1++) {
	   result+=result+arr[ctr1];
	  
	}
    average = result/num;
    System.out.println("the average is "+ average);
}
}