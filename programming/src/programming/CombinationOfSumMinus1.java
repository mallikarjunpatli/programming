package programming;
import java.util.Scanner;
public class CombinationOfSumMinus1
{
	public static int get(int []a)
	{
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];// write sum also and product
		
		}return sum;
	}

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
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++)
		{
		int k=m-a[i];
			if(k<min)
			{
			min=k;
			}
			if(k>max)
				{
				max=k;
				}
		}
		System.out.println(min);
		
		System.out.println(max);	
	
	
		
	}
}

