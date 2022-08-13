import java.util.Arrays;
import java.util.Scanner;
public class ArrayRemove {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the size of the array :");
		
		int arrSize =input.nextInt();
		int arr;
		int arr1[] = new int[arrSize];
		
			for(int i =0; i<arrSize; i++) {	
				System.out.print("enter the "+i+" element :");
																									
				arr1[i] = input.nextInt();
			}
			System.out.println("the entered array is "+ Arrays.toString(arr1));
			System.out.println();
			System.out.println("enter the element to remove :");
			int elementToRemove = input.nextInt();
					for(int i =0; i<arrSize; i++) {	
		        			if(arr1[i] == elementToRemove) {
							continue;
						} else
							System.out.print("the removed array is :"+ arr1[i]+" ");
						
						}
					}
	}

