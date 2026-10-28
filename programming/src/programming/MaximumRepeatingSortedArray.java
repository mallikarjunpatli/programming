package programming;
import java.util.Scanner;

public class MaximumRepeatingSortedArray {


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
	  public static int get(int []a) 
	 {
	for(int i=a.length-2; i>=0; i--)
	{
		if(a[i]==a[i+1])
		{
			return a[i];
		}
	}
	return a[i];
	 }
}

