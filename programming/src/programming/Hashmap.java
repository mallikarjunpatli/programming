package programming;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {
	public static void main(String arg[]) {

		HashMap map=new HashMap();

		map.put("indea",9434);
		map.put("china",434);
		map.put("astrelia",934);
		map.put("japan",94);
		
		Set keys=map.keySet();
		
		for(Object x:keys)
			{
			System.out.println(x+" "+map.get(x));
			};
}
}
