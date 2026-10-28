package programming;
import java.util.Scanner;
public class nThPrimeNumber {

 boolean cheeckprime(int n)
{
	if(n<2)
{
	return false;
}
for(int i=2; i<n; i++)
{
	if(n%i==0)
	{
		return false;
	}
}
return true;
}
 
 int count=0, lastPrime=0;
    void Getprime(int n2)
 {
 for(int i=0; count<n2; i++)
 {
 if(cheeckprime(i))
 {
	 lastPrime=i;
	count++;	
 }
 }
    System.out.println(lastPrime);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 nThPrimeNumber obj=new  nThPrimeNumber();
		Scanner scan=new Scanner (System.in);
		int n1=scan.nextInt();
		obj.Getprime(n1);
				
	}
}
