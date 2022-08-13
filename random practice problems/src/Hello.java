import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Hello {
	
	public static void main(String[] args)  {
		/*
		 * InputStreamReader input = new InputStreamReader(System.in); BufferedReader
		 * buffer = new BufferedReader(input);
		 * 
		 * System.out.println("enter you name");
		 * 
		 * String name = buffer.readLine(); int num = Integer.parseInt(name);
		 * System.out.println(num);
		 * 
		 * System.out.println("HELLO WORLD AND NOW IM");
		 */
		
		List<Integer> namesArrayList =  new ArrayList<>();
		List<Integer> namesLinkedList = new LinkedList<>();
		
		for(int i=0; i<1000000; i++)
		{
			namesArrayList.add(i);
			namesLinkedList.add(i); 
			
		}
		
		final long startTimeAl = System.nanoTime();
		namesArrayList.remove(50000);
		final long endTimeAl = System.nanoTime();
		
		final long startTimeLl = System.nanoTime();
		namesLinkedList.remove(50000);
		final long endTimeLl = System.nanoTime();
		
		final long totalTimeAl = endTimeAl - startTimeAl;
		final long totalTimeLl = endTimeLl - startTimeLl;
		
		System.out.println(totalTimeAl);
		System.out.println(totalTimeLl);
		
		
	}

}
