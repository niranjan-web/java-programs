import java.util.Arrays;
import java.util.Scanner;

public class CopiedArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array :");
		
		int arrSize =input.nextInt();
		
		int arr[] = new int[arrSize];
		int copiedArr[] = new int[arrSize];																											//		System.out.println("the original array is "+ Arrays.toString(arr));
																													//		int clonedArray[] = arr.clone();
			for(int i =0; i<arrSize; i++) {																							//		System.out.println("the cloned array is "+Arrays.toString(clonedArray));
				arr[i] = input.nextInt();
			}
			for(int i =0; i<copiedArr.length; i++) {
			copiedArr[i]=arr[i];
				System.out.print(copiedArr[i]+" ");
			}
		}

}
