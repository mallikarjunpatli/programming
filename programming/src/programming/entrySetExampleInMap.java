package programming;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class entrySetExampleInMap {
	public static void main(String arg[]) {

		HashMap<String ,Integer> map=new HashMap<String ,Integer>();

		map.put("indea",9434);
		map.put("china",434);
		map.put("astrelia",934);
		map.put("japan",94);

		Set<Entry<String,Integer>> entries=map.entrySet();

		for(Entry<String,Integer> x:entries)
		{
			System.out.println(x.getKey()+" "+x.getValue());
		};
	}
}


