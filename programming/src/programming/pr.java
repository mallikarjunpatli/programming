package programming;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class pr {
	public static void main(String arg[]) {
		
		String s="missisiippi";

		HashMap<Character ,Integer> map=new HashMap<Character ,Integer>();
		
		
		for(int i=0; i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				int c=map.get(ch);
				map.put(ch,c+1);
			}
			else
			{
				map.put(ch,1);
			}
			
		}
		
		Set<Entry<Character,Integer>> x=map.entrySet();
		
	for(Entry<Character,Integer> ent:x)
	{
		System.out.print(ent.getKey()+""+ent.getValue());
	}

	
	}
}


