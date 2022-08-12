package datastructure;
import java.util.Arrays;

public class Sorting {
	//recursion part
	public static int[] mergeSort(int[] arr)
	{
		if(arr.length == 1)//end condition for recursion loop
		{
			return arr;
		}
		
		int mid = arr.length/2;//to find the mid point of an given array
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left,right);
        
	}
	
	public static int[] merge(int[] first,int[] second)
	{
		int[] joined = new int[first.length + second.length];
		
		int i=0,j=0,k=0;
		
		while(i<first.length && j<second.length)
		{
			if(first[i]<second[j])
			{
				
				joined[k++] = first[i++];
			}
			else
				joined[k++] = second[j++];
			
		}
		
		while(i<first.length)
		{
			joined[k++] = first[i++];
		}
		while(j<second.length)
		{
			joined[k++] = second[j++];
		}
		return joined;
	}

}
