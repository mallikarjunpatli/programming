package programming;

import java.util.Scanner;
public class NminusArrayProductOfArray {

	public static int get(int []a)
	{
		int product=1;
		for(int i=0; i<a.length;i++)
		{
			product=product*a[i];// write sum also and product

		}return product;c
	}

	public static int[] product(int []a)
	{
		int m=get(a);
		int res[]=new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			res[i]=m/a[i];
		}return res;
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

		int []l=product(a);
		for(int i=0; i<l.length; i++)
		{
			System.out.print(l[i]+" ");
		}

	}

}





