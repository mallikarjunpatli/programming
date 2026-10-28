package programming;
import java.util.Scanner;
public class SumOfPrimeDigit {
	
	public static boolean cheeckprime(int n)
	{
		if(n<2)
		{
		return false;
		}
	for(int i=0; i<n; i++)
	{
	if(n%2==0)
	{
		return false;
	}
	}
	return true;
	}
	
	public static int getSum(int n1) 
	{
	int rev=0;
	
	while(n1!=0) {
	int rem=n1%10;
	
	if(cheeckprime(rem)) 
	{
	rev=rev+rem;
	}
	n1=n1/10;
	}return rev;
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n2=scan.nextInt();
		int m=getSum(n2);
		System.out.println(m);
		
	}
		
}