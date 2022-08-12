import java.util.Random;

public class ArraySortingDemo {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int arr[] = new int[10];
		
		for(int i =0;i<10;i++)
		{
			arr[i] = rand.nextInt(10);
		}
		
		for(int aray:arr)
		{
			System.out.println(aray);
			
		}
		System.out.println("------------------------------");
		
		int j=1;
		int i=0;
		while(i<arr.length)
		{
			while(j<arr.length)
			{
				if(arr[j]<arr[j-1])
				{
					int temp= arr[j];
					arr[j] = arr[j-1];
					temp = arr[j-1];
				}
				j++;
			}
			i++;
		}
		for(int array:arr)
		{
			System.out.println(array);
		}
	}

}
