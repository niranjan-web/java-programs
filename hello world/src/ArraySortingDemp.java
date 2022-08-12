import java.util.Arrays;

public class ArraySortingDemp {

	public static void main(String[] args) {
		int arr[] = new int[] {22,45,89,65,41,90,33,2};
		
		System.out.println(Arrays.toString(toSortingArray(arr)));
	}

	private static int[] toSortingArray(int arr[]) {
		
		int i=0;
		while(i<arr.length)
		{
			int j=i+1;
			while(j<arr.length)
			{
				if(arr[i]<arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
			i++;
		}
		return arr;
	}

}
