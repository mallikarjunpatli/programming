package programming;
import java.util.Scanner;

public class MaximiumPair {
	
	public static int  get(int []a)
	{
		int secondLargest=Integer.MIN_VALUE;
	
		int max=Integer.MIN_VALUE;
		
	for(int i=0; i<a.length; i++)
	{
		if(a[i]>max)
		{
			secondLargest=max;
			max=a[i];
		}
		else if(a[i]>secondLargest) 
		{
			secondLargest=a[i];
			 
		}
	}
	return secondLargest+max;
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
		
		
		

	
	
		
	



