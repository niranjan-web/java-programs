import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {
		
		
		method();
		
		
		
		

	}

	private static void method() {
		Scanner scan = new Scanner(System.in);
		System.out.println("which number do you want to find in this array");
		int toFind = scan.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int min = 0;
		int max = arr.length-1;
		while(min <= max)
		{
			int mid = (min+max)/2;
			
			if(arr[mid] == toFind)
			{
				System.out.println("position" +mid +"value" +arr[mid]);
				break;
			}
			else if(toFind<arr[mid])
			{
				max =mid-1;
				
				
			}
			else  if(toFind>arr[mid])
			{
				min = mid+1;
				
				
			}
			else
			{
				System.out.println("the item that you entered is not present in this array");
				break;
				
			}
			
		}
		
	}
	

}
