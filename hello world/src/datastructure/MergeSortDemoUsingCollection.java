package datastructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MergeSortDemoUsingCollection {
	public static void main(String[] args) {
		
		
		Random rand = new Random();
	
		ArrayList<Integer> arr =  new ArrayList<>();
		for(int i =0; i<100;i++)
		{
			arr.add(i,rand.nextInt(100));
		}
		
		for(int array: arr )
		{
			System.out.print(array);
		}
		
		System.out.println("after sorting");
		
		long startTime = System.nanoTime();
	   Collections.sort(arr);
	   long endTime =  System.nanoTime();
	   
	   long actualTime = endTime - startTime;
	   System.out.println(actualTime);
	  
	  for(int array1:arr)
	  {
		  System.out.print(array1);
	  }
		
	}

}
