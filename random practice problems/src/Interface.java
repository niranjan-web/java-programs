
public class Interface {
	
	public static void main(String[] args) {
		
		int position = method();
		if(position>0)
		{
			System.out.println("the value is present in the array "+position);
		}else 
			System.out.println("the value is not present in the array ");
		
		//linear search
		
		/*
		 * int i=0; while(i<arr.length) { int j=i+1; while(j<arr.length) {
		 * if(arr[i]<arr[j]) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } j++;
		 * } i++; }
		 */
		
		
		
//		for(int element:arr)
//		{
//			System.out.println(element);
//		}
	}

	public static int method()
	{
		//Binary search
		        int arr[] = new int[] {22,32,42,52,62,72};
				int min = 0;
				int max = arr.length-1;
				
				int toFind = 22;
				while(min<max)
				{
					int mid = (min+max)/2;
					
					if(arr[mid] == toFind)
					{
						return  mid;
					}
					else if(toFind<arr[mid])
					{
						max = mid-1;
					}
					else if(toFind>arr[mid])
					{
						 min = mid+1;
					}
					
				}
				return -1; 
	}
	

}
