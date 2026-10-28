package programming;

import java.util.Scanner;

public class DvisibleBy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		if(n%10==0)// instand of writing n%2, n%5, n%10 write n%10
		{
			System.out.println("yes");
		}

	}

}
