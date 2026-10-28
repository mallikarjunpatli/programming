package programming;
import java.util.Scanner;
public class OccurenceValue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();

		int []a=new int [n];

		for(int i=0; i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}

		int m=get(a,k);
		System.out.println(m);
	}
	public static int get(int []a,int k)
	{

		int count=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==k)
			{
				count++;	
			}

		}return count;
	}

}



