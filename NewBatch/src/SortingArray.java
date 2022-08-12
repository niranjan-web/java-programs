//TO SORT AN ARRAY
import java.util.Scanner;
public class SortingArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the size of an array :");
		int arrSize = input.nextInt();
		int arr[] = new int[arrSize]; 
				
		//getting the value of the array to the index respectively
		for (int ctr = 0; ctr<arrSize; ctr++)
			{
			System.out.println("enter the value of "+ctr +" element :");
			arr[ctr] = input.nextInt();
			}
		for(int aray:arr)
		{
			System.out.println(aray);
		}
		//sorting the array
		System.out.println("the sorting array is :");
//		for (int i = 0; i<arrSize; i++) 
//		{
		int i =0;
		while( i<arrSize) {
			for(int j = 1; j< arrSize; j++) //1,2,3,4,5,
			{
				//compare the adjacents value and swap it
				if(arr[j]<arr[j-1]) 
				{
					var temp = arr[j];
					arr[j] =arr[j-1];
			        arr[j-1] = temp;
				}
		}i++;
		} 
		//printing the sorted array using foreach loop
		for (int myArray : arr) {
			System.out.print(myArray+" ");
		}
}
}
