package programming;

import java.util.Scanner;

public class AbsoluteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		System.out.println(Math.abs(n));// Inbuilet function
		if(m>=0)
		{
			System.out.println(m);
		}
		else
		{
		
		System.out.println(-(m)); //without Inbuilt
		}

	}

}
