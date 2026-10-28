package programming;

public class FirstNonReaptingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s="programming";


		for(int i=0; i<s.length();i++)
		{

			int count=0;

			for(int j=0; j<s.length();j++)
			{
				char ch=s.charAt(i);
				char ch1=s.charAt(j);
				
				if(ch==ch1)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(i);
				break;
			}
		}

	}

}
