package practice;

public class BinarySearchDemo {
	 public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,0};
		System.out.println(method(arr));
	}
	 public static int method(int arr[])
	 {
		 int toFind = 5;
		 int min=0;
		 int max = arr.length-1;
		 if (min<=max)
		 {
			 int i=0;
			 while(i<arr.length)
			 {
				 int mid = (min+ max)/2;
				 if(arr[mid] == toFind)
				 {
					 return mid;
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
			 i++;
		 }
		 return 0;
	 }
}
