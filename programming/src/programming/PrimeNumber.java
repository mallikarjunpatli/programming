package programming;
import java.util.Scanner;

public class PrimeNumber{

		public static boolean cheeckPrime(int n)
		{
			if(n<2)
			{
				return false;
			}
			else 
			{
				for(int i=2; i<=n/2; i++)
				{
					if(n%i==0)
					{
						return false;
					}
				}
			return true;
			}
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int n1=scan.nextInt();
			
			System.out.println((cheeckPrime(n1))? "prime" : "not prime");
			

			
}
}



