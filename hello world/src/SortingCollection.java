import java.util.List;

public class SortingCollection {
	
	public static List<Integer> mergeUsingCollection(List<Integer> arr)
	{
		if(arr.size() == 1)
			return arr;
		
		int mid = arr.size()/2;
		
		List<Integer> leftArr = arr.subList(0, mid);
		List<Integer>  rightArr = arr.subList(mid, arr.size());
		
		List<Integer> leftArr1 = mergeUsingCollection(leftArr);
		List<Integer> rightArr2 = mergeUsingCollection(rightArr);
		
		
		return mergeLeftAndRight(leftArr1,rightArr2);
	
	}

	public static List<Integer> mergeLeftAndRight(List<Integer> first, List<Integer> second) 
	{
//		int joined[] = new int[first+second];
//		List<Integer> joined =  first.
		
		
		return null;
	}

}
