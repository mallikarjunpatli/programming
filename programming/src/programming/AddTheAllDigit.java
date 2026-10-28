package programming;
import java.util.Scanner;
public class AddTheAllDigit {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int m=get(n);
		System.out.println(m);
		
	}
	//Division rule: when dividing a negative number by a positive number, the quotient is negative.

/*
-243÷10
Integer division (ignoring remainder):

10 × (-24) = -240

Remainder = -243 - (-240) = -3

−243÷10=−24
remainder −3
−243÷10=−24 remainder −3 */
		public static int get(int n)
		{
		int remb,sum=0;
		while(n!=0) {
		remb=n%10;
		sum=sum+remb;
		n=n/10;
		}
		return sum>0?sum:-sum;
		}
		
	}
