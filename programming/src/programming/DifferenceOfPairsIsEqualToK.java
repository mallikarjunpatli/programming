package programming;
import java.util.Scanner;

public class DifferenceOfPairsIsEqualToK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();

		int []a=new int [n];
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
			if(PrimeNumber.cheeckPrime(a[i])) 
				{
				System.out.println(a[i]+" "+a[j]);
				}
				
			}
		}

	}

}



	


	
