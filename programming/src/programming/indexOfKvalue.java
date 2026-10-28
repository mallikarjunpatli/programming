package programming;

import java.util.Scanner;

public class indexOfKvalue 
{
	public static void main(String []args)
	{
	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();
	
	int []a=new int [n];
	
	for(int i=0; i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	int k=scan.nextInt();
	
	int m=get(a,k);
	System.out.println(m);
	
	}
	
	public static int get(int []a,int k)
	{
	for(int i=0; i<a.length;i++)
	{
		if(a[i]==k)
		{
	
	return i;
		}
		
	}
	return -1;
	}
	
	}


	
