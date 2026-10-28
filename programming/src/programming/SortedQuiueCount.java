package programming;
import java.util.Scanner;
public class SortedQuiueCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();

	int []a=new int [n];
	
	for(int i=0; i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	
	int count=1,uniquecount=0;
	for(int i=0; i<a.length-1; i++)
	{
		if(a[i]==a[i+1])
		{
			count++;
		}
		else
		{
			if(count==1)
			{
				uniquecount++;
			}
			count=1;
		}
		
	}
			
if(a[a.length-1]==count) 
{
	uniquecount++;
}
System.out.println(uniquecount);


	}

}



