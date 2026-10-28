package programming;
import java.util.HashSet;

public class AutoBoxingHashSetObjectExample {

	public static void main(String arg[]) {

		HashSet<Object> set=new HashSet<Object>();

		set.add(20);
		set.add(48.5);
		set.add("malli");
		set.add(39.3f);
		set.add('m');
		set.add('1');

		
		for(Object x:set)
		{
			
		System.out.print(x+"  ");
		}
	}

}





