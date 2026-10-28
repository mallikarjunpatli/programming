package programming;
import java.util.Scanner;
public class SumOfArray {

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
	public static int get(int []a)
	{
	int sum=1;
	for(int i=0; i<a.length;i++)
	{
		sum=sum*a[i];// write sum also and product
		
	}return sum;
	}
}
