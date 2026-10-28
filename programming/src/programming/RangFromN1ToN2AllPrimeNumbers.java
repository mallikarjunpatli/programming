package programming;
import java.util.Scanner;


public class RangFromN1ToN2AllPrimeNumbers {

		public static boolean cheeckPrime(int n)
		{
		if(n<2)
		{
			return false;
		}
		
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
		}
		
		public static void Prime(int n1,int n2)
		{
			for(int i=n1; i<=n2; i++)
			{
				if(cheeckPrime(i))
				{
					System.out.println(i);
				}
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int n1=scan.nextInt();
			int n2=scan.nextInt();
			 Prime(n1, n2);
}
}





