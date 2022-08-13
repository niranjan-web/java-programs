
public class PracticeSearchDemo {
	public static void main(String[] args) {
		
		int index = search();
		if(index >= 0)
		 {
			 System.out.println(index +" the enter is present in the given array");
		 }
		 else
			 System.out.println("the enter number is not valid ");
		
	}
	
	public static int search()
	{
		int arr[] = {21,22,23,26,25,26,27};
		int toFind = 27;
		int min = 0;
		int max = arr.length-1;
		
		while(min <= max)
		{
			int mid = (min+max)/2;
			if(toFind == arr[mid])
			{
				return mid;//return the index of the array 
			}
			else if(toFind < arr[mid])
			{
				max = mid-1;
			}
			else if(toFind > arr[mid])
			{
				min = mid+1;
			}
		}
		return -1;
	}	
}
