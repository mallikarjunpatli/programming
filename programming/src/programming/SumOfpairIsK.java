package programming;
import java.util.Scanner;
public class SumOfpairIsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();

		int []a=new int [n];
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		int k=scan.nextInt();
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
			if(a[i]+a[j]==k) 
				{
				System.out.println(a[i]+" "+a[j]);
				}
				
			}
		}

	}

}



	
