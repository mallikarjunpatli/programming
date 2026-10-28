package programming;

import java.util.LinkedHashSet;

public class promblem1 {

		public static void main(String arg[]) {

			LinkedHashSet<Character> set=new LinkedHashSet<Character>();
			
			String s="misisippi";
			
			for(int i=0;i<s.length();i++)
			{
				
			set.add(s.charAt(i));
			
			}
			
			String t="";
			
			for(char x:set)
			{
				t=x+t;//easy to reverse
			}
			System.out.println(t);
	}
	}



