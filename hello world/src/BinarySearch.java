
public class BinarySearch {
	public static void main(String[] args) {
		int arr[] =  new int[]{1,2,3,4,5,6,7,8,9};
		int result = method(arr);
		if(result >= 0)
		{
			System.out.println("yes it is in the array "+ result);
		}
		else System.out.println("no it is not present in the array "+ result);
		
	}
	
	public static int method(int arr[])
	{
		int min = 0;
		int max = arr.length-1;
		
		int findValue = 9;
		while(min <= max)
		{
			int mid = (min + max)/2;
			if(arr[mid] == findValue)
			{
				return mid;
			}
			else if(findValue < arr[mid])
			{
				max = mid-1;
			}
			else if(findValue > arr[mid])
			{
				min = mid+1;
			}
			
		}
		return -1;
	}
}
