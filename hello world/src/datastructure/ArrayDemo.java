package datastructure;
//array sorting
public class ArrayDemo {
	public static void main(String[] args) {
		int arr[] = { 50, 40, 30, 20, 10 };

		for (int i = 0; i < arr.length; i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if (arr[i] < arr[j]) 
			{
				int temp = arr[i];
				arr[i] = arr[j];
				 arr[j] = temp;
			}
			}
		}
//		int i=0;
//		while(i<arr.length)
//		{
//			int j = i+1;
//			while(j<arr.length)
//			{
//				if (arr[i] < arr[j]) 
//				{
//					int temp = arr[i];
//					arr[i] = arr[j];
//					 arr[j] = temp;
//				}
//				j++;
//			}
//			i++;
//		}
		
		for(int a:arr)
		{
			System.out.println(a);
		}
//			System.out.println(arr[arr.length-2]);
		
		
		}
	}

