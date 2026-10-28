 package programming;

import java.util.Scanner;

class Demo1
{
	void alph()
	{
				System.out.println("Connection Established4:");
		
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the nomerator");
				int a=scan.nextInt();
				System.out.println("Enter the denomerator:");
				int b=scan.nextInt();
				System.out.println(a/b);
				
				System.out.println("Connection ternmination1:");
	}

}
class Demo2
{
	void beta()
	{
		try {
		System.out.println("Connection Established3:");

		Demo1 d=new Demo1();
		d.alph();
		
		
		}
		catch(Exception e)
		{
			System.out.println("give Non-zero Denomeratot:");
			
		}
	}

	
	
}
class Demo3
{
	void gamma()
	{
		System.out.println("Connection Established2:");

		Demo2 d=new Demo2();
		d.beta();
		
		System.out.println("Connection  ternminatedd3:");	
	}
}

public class RethrowingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection Established1:");

		Demo3 d=new Demo3();
		d.gamma();
		
		System.out.println("Connection Trenminated4:");
		  
	}

}
