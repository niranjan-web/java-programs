package leetcode;

import java.util.Arrays;

public class LeetCodeP2 {
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		long start = System.nanoTime();
		System.out.println(Arrays.toString(twoSum(arr,7)));
		long end = System.nanoTime();
		
		System.out.println(end-start);
	}

	public static int[] twoSum(int[] nums, int target) {
		
		for (int i = 0; i < nums.length - 1; i++) {
			
			for (int j = i + 1; j < nums.length; j++) {
				
				if (nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		
		return new int[] {-1,-1};
	}
}


