import java.util.Arrays; 
public class ArraySortingDemo
{
	public static void main(String args[])
	{
		int arr[] = {3,2,1,5,6,7,4,8,0};
		
		System.out.println(Arrays.toString(method(arr)));

	}

	public static int[] method(int arr[]){

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
						{
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}						}
		}return arr;	
	}
}



