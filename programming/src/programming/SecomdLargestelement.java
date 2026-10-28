package programming;
import java.util.Scanner;
public class SecomdLargestelement {


	public static void main(String[] args) {
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
		public static int  get(int []a)
		{
		int secondLargest=0;
		
		int max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				secondLargest=max;
				max=a[i];
			}
			else if(a[i]>secondLargest && a[i]!=max) 
			{
				secondLargest=a[i];
				 
			}
			}
			
		
		return secondLargest;
		}
		
		
}
	
	
		
	

