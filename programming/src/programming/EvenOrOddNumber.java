package programming;

import java.util.Scanner;

public class EvenOrOddNumber {
	
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();
	
	if(n%2==0)
	{
		System.out.println("Even number");
	}
	else
	{
		System.out.println("odd Number");
	}
}
}
