package programming;
import java.util.Scanner;

public class SortedArraylargestRepeatingElement {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();

	int []a=new int [n];
	
	for(int i=0; i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	int larg=-1;
	for(int i=0; i<a.length; i++)
	{
		if(a[i]==a[i+1])
		{
			larg=a[i];
			break;
		}
	}
	System.out.println(larg);
	
	}
}
	



