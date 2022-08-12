package datastructure;
import java.util.Arrays;
import java.util.Random;

public class MergeSortDemo {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] arr = new int[100000];
		
		long startTime =  System.nanoTime();
		for(int i=0;i<1000;i++)
		{
			arr[i] = rand.nextInt(10000);
		}
		arr = Sorting.mergeSort(arr);
		long endTime = System.nanoTime();
		long actualTime = endTime-startTime;
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(actualTime);
		
	}

}

