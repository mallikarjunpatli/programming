package programming;
import java.util.Scanner;

public class ReversNumber {
	public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	
	int r=scan.nextInt();
	int m=get(r);
	System.out.println(r==m?"polyndrom":"not polyndrom");
	// same code will use for both reverse and polyndrom program
	
			}

   public static int get(int n) 
	{		
	int rev=0;
	while(n!=0) 
	{
	int remb=n%10;
	
	rev=rev*10+remb;
	
	n=n/10;
	}
	 return rev;
	
}
}

