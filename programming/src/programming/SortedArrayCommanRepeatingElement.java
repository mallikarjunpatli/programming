package programming;
import java.util.Scanner;
public class SortedArrayCommanRepeatingElement {
 
	static void get(int []a1,int []a2)
	{
		int i=0,j=0;
		while(i<=a1.length &&  j<=a2.length)
		{
			if(a1[i]==a2[j])
			{
				System.out.print(a1[i]+" ");
				i++;
				j++;
			}
			else if(a1[i]>a2[j])
			{
				j++;
			}
			else
			{
				i++;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	int n1=scan.nextInt();

	int []a1=new int [n1];
	
	for(int i=0; i<a1.length;i++)
	{
		a1[i]=scan.nextInt();
	}
	
	int n2=scan.nextInt();

	int []a2=new int [n2];
	
	for(int i=0; i<a2.length;i++)
	{
		a2[i]=scan.nextInt();
	}
	
	get(a1,a2);
	}
}
