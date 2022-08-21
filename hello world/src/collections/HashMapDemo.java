package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashMap<String,Integer> hash = new HashMap<>();
		
		hash.put("niranjan",1);
		hash.put("alexander",2);
		hash.put("jake paul",3);
		hash.put("logan paul",4);
		hash.put("conor",5);
		hash.put("khabib",6);
		
		Collection<Integer> col = hash.values();
		System.out.println(col);
		Set<?>  set = hash.entrySet();
		Iterator<?> itr = set.iterator();
		
		while(itr.hasNext())
		{
			
			Map.Entry<String, Integer> obj  = (Map.Entry<String, Integer>)itr.next();
			System.out.println(obj.getKey() + " " +obj.getValue());
		}
		
	
		
		
	}

}
