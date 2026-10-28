package programming;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetExample {

	public static void main(String arg[]) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		set.add(20);
		set.add(45);
		set.add(10);
		set.add(05);
		set.add(24);
		set.add(24);
		System.out.println(set);
	}

}
