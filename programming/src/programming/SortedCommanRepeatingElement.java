package programming;

import java.util.Scanner;

public class SortedCommanRepeatingElement {


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

	int []a1=new int [n1];
	
	for(int j=0; j<a1.length;j++)
	{
		a1[j]=scan.nextInt();
	}
	boolean found=false;
	for(int i=0; i<a.length; i++)
	{
		for(int j=0; j<a1.length; j++)
		{
			if( a[i]==a1[j] )
			{
				
				System.out.println(a[i]+" ");
				found=true;
				
			}
			
		}
	}
	if(!found)
	{
		System.out.println("No comman element in sorted array");
	}
		

}
}



