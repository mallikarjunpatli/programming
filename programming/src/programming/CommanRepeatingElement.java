package programming;
import java.util.Scanner;

public class CommanRepeatingElement {
	
static void get(int a[],int b[])
{
	boolean found=false;
	int i=0,j=0;
	int lastprint=Integer.MIN_VALUE;
	while(i<a.length && j<b.length)
	{
		if(a[i]==b[j] && a[i]%2!=0)
		{
			if(a[i]!=lastprint)
			{
			System.out.print(a[i]+" ");
			lastprint=a[i];
			
			found=true;
			}
			i++;
			j++;
		}
		else if(a[i]<b[j])
		{
			i++;
		}
		else
		{
			j++;
		}
	}
	if(!found)
	{
		System.out.println("No comman element found");
	}
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
	
	int n1=scan.nextInt();

	int []b=new int [n1];
	
	for(int i=0; i<b.length;i++)
	{
		b[i]=scan.nextInt();
	}
	
	get(a,b);
	}
}



