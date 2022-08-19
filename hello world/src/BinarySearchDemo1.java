
public class BinarySearchDemo1 {
	public static void main(String[] args) {
		int arr[] =  new int[]{1,2,3,4,5,6,7,8,9};
		int result = binary(arr);
		if(result>0)
		{
			System.out.println("the enter value is present int the array "+result);
		}else
		System.out.println("the entered value is not present in the array "+result);
		
		
	}
	
	public static int binary(int arr[])
	{
		int find = 10;
		int min = 0;
		int max = arr.length-1;
		
		while(min<=max)
		{
			int mid = (min + max)/2;
			
			if(arr[mid] == find)
			{
				return mid;
			}
			else if(find < arr[mid])
			{
				max = mid-1;
			}
			else if (find > arr[mid])
			{
				min = mid+1;
				max = (arr.length)-1;
			}
			
		}
		return -1;
	}

}
