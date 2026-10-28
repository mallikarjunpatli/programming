package programming;
import java.util.Scanner;

public class MinmumArrayPair {
	
	public static int get(int []a)
	{
	int firstLargest=Integer.MAX_VALUE;
	int secondLargest=Integer.MAX_VALUE;
	
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<firstLargest)
			{
				secondLargest=firstLargest;
				firstLargest=a[i];
			}	
			else if(a[i]<secondLargest)
			{
				secondLargest=a[i];		
			}
		}
	return firstLargest+secondLargest;
	
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int []a=new int [n];
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=scan.nextInt();
		}
		
		int m=get(a);
		System.out.println(m);

	}
}
	
	
	


