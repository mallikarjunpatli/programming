package programming;

public class MaximumCharacterInWordPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="The quick brown fox jumps";
		String max="";
		
		String word[]=s.split(" ");
		
		
		for(int i=0; i<word.length;i++)
		{
		if(word[i].length()>max.length())
		{
			max=word[i];
		}
		}
		
		for(int i=0; i<word.length;i++)
		{
		if(word[i].length()==max.length())
		System.out.println(word[i]);
		}
		}
				
				

	}


