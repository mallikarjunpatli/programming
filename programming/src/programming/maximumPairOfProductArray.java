package programming;
import java.util.Scanner;

public class maximumPairOfProductArray {
	public static int get(int []a)
	{
	int firstLargest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	
	int firstSmallest=Integer.MAX_VALUE;
	int secondSmallest=Integer.MAX_VALUE;
	
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>firstLargest)
			{
				secondLargest=firstLargest;
				firstLargest=a[i];
			}	
			else if(a[i]>secondLargest)
			{
				secondLargest=a[i];		
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<firstSmallest)
			{
				secondSmallest=firstSmallest;
				firstSmallest=a[i];
			}	
			else if(a[i]<secondSmallest)
			{
				secondSmallest=a[i];		
			}
		}
		
			int p=firstLargest*secondLargest;
			int p1=firstSmallest*secondSmallest;
			return (p>p1)?p:p1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();

		int []a=new int [n];
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		int m=get(a);
		System.out.println(m);
	}
}
		
		
		

	
	
		
	






	
