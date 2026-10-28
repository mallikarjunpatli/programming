package programming;
import java.util.Scanner;
public class MaximumArray {

	public static void main(String[] args) {
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
	public static int get(int []a)
	{
		int max=Integer.MIN_VALUE;
		int index=0;
	for(int i=0; i<a.length;i++)
	{
		if(a[i]>max)
		{
		max=a[i];
		index=i;
		}
	}return index;

	}

}
