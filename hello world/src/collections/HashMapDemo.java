package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String,Integer> hash = new HashMap<>();
		
		hash.put("niranjan",1);
		hash.put("alexander",2);
		hash.put("jake paul",3);
		hash.put("logan paul",4);
		hash.put("conor",5);
		hash.put("khabib",6);
		
		Set names = hash.entrySet();
		
		Iterator itr = names.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> map = (Map.Entry) itr.next();
	
			System.out.println(map.getKey()+" "+ map.getValue());
		}
	}

}
