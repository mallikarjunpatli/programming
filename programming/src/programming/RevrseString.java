package programming;

public class RevrseString {

	public static void main(String[] args) {
				
				String s="Hello World";
				
				String word[]=s.split(" ");
				
				
				for(int i=word.length-1;i>=0;i--)
				{
					System.out.print(word[i]+" ");
				}
				}
				

}
