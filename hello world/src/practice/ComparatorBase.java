package practice;

import java.util.Comparator;

public class ComparatorBase implements Comparator<Movies>{

	@Override
	public int compare(Movies m1, Movies m2) {
		
		if(m1.year>m2.year)
		{
			return -1;
		}else if(m1.year<m2.year)
		{
			return 1;
		}
		return 0;
	}
	
}
