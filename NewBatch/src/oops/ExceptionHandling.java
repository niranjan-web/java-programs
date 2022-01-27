package oops;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2,3,4,5,6};
		
		try {
		for(int i = 0; i<arr.length; i++) {
			
			System.out.println(arr[i]+" ");
		}
		}
		catch(Exception e) {
			System.out.println("you trying to fetch element that are not available in the given array!");
	}
		System.out.println("after exception statement");
	
	}
}

