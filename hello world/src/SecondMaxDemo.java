
public class SecondMaxDemo {
	public static void main(String[] args) {
		int arr[] = {8,4,9,6,2,1};
		 
		method(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	
	public static void method(int arr[])
	{
		int i = 0;
		while(i<=3)
		{
			int j = i+1;
			while(j<arr.length)
			{
				if(arr[i] > arr[j])
				{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				}
				j++;
			}
			i++;
		}
		
	}

}
