package programming;

public class wordChange { 

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
	static int getCount(String str) {
	int ch=0;
		for (int i=0;i < str.length();  i++) 
		{
			ch++;
		}
		return ch;
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

		String s = " how are you machha";

		String res[]=split(s);

		String k="";
		for(int i=0; i<res.length;i++)
		{
			
			
			int m=getCount(res[i]);

			System.out.print(res[i]+m+" ");
			k="";
		}
	}


}



