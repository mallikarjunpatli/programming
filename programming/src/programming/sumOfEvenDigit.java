package programming;
import java.util.Scanner;
public class sumOfEvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=get(n);
		System.out.println(m);
		
	}
		public static int get(int n)
		{
		int rev=0;
		while(n!=0)
		{
		
		int rem=n%10;
		
		if(rem%2==0)
		{
			rev=rev+rem;
		}
		n=n/10;
		}
		return rev;
		}

	}


