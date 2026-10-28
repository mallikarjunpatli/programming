package programming;

import java.util.HashSet;

public class AutoUnboxingHetrogeniusHashSetExample {



	public static void main(String arg[]) {

		HashSet<Integer> set1=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();

		set1.add(20);
		set1.add(330);
		set1.add(4);
		set1.add(3);


		for(int x:set1)
		{

			System.out.print(x+"  ");
		}
		System.out.println();
		System.out.println(set1.size());
		System.out.println(set1.contains(20));
		System.out.println(set1.contains(2323));
		System.out.println(set1.isEmpty());
		System.out.println();
		System.out.println(set1);
		set2.addAll(set1);
		System.out.println(set2);
		set1.clear();
		System.out.println(set1);
	}

}








