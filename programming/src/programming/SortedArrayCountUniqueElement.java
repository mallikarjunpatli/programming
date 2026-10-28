package programming;
import java.util.Scanner;
public class SortedArrayCountUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();

	int []a=new int [n];
	
	for(int i=0; i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	
	int count=1;
	for(int i=1; i<a.length-1; i++)
	{
		if(a[i]!=a[i+1] && a[i]!=a[i-1])
		{
			count++;
		}
		
	}
			
if(a[a.length-1]!=a[a.length-2]) 
{
	count++;
}
System.out.println(count);


	}

}
