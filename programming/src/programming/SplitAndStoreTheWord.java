package programming;

public class SplitAndStoreTheWord { 

	static String[]  split(String s)
	{

		int n=count(s);

		String []arr=new String[n];
		int  j=0;

		String t="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				t+=s.charAt(i);
			}
			else
			{
				if(t.length()>0)
				{

					arr[j]=t;
					j++;
					t="";
				}
			}
		}
		arr[j]=t;
		return arr;
	}
	static String reverseWord(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	static int count(String s)
	{
		int count=0;
		for(int i=0; i<s.length()-1;i++)
		{
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
			{
				count++;
			}
		}return (s.charAt(0)==' ')?count:count+1;
	}

	public static void main(String[] args) {

		String s = " how are you";

		String res[]=split(s);

		String k="";
		for(int i=0; i<res.length;i++)
		{
			k+=reverseWord(res[i]);


			System.out.print(k+" ");
			k="";
		}
	}


}



