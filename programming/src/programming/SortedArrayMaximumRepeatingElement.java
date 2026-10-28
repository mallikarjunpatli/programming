package programming;

import java.util.Scanner;

public class SortedArrayMaximumRepeatingElement 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();

	int []a=new int [n];
	
	for(int i=0; i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	int larg=0;
	int max=Integer.MIN_VALUE;
	for(int i=0; i<a.length-1; i++)
	{
		if(a[i]>max)
		{
			max=a[i];
			if(max==a[i+1])
			{
				larg=a[i];
			}
		}
	}
	
System.out.println(larg);
}
}

