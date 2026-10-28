package programming;

public class CountVowelsAndConsonets {

	public static void main(String[] args) {
String s="Hello World!";

int VowelCount=0;

int  ConsonetCount=0;



for(int i=0; i<s.length();i++)
{
	char ch=s.charAt(i);
	
	if((ch>='A'&& ch<='z')|| (ch>='a' && ch<='z'))
	{
		
		 ch=Character.toLowerCase(ch);
		 if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
		 {
			 VowelCount++;
		 }
		 else
		 {
			 ConsonetCount++;
		 }
		
	}
	
}

System.out.println(VowelCount+" "+ ConsonetCount++);
	}

}
