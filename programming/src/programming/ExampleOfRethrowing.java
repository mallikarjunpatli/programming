package programming;

import java.util.Scanner;



	class Demo4
	{
		void alph() throws Exception
		{
				try {
					System.out.println("Connection Established1 :");
				
			
					Scanner scan=new Scanner(System.in);
					System.out.println("Enter the nomerator");
					int a=scan.nextInt();
					System.out.println("Enter the denomerator:");
					int b=scan.nextInt();
					System.out.println(a/b);
					
				}
				
				catch(Exception e)
				{
					System.out.println("Give non-zero number:");
					throw e;
				}
				finally {
				System.out.println("connection Termination1");
				}
		}

	}

public class ExampleOfRethrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Demo4 d=new Demo4();
		d.alph();
		}
		catch(Exception e)
		{
			System.out.println("connection Termination2");
		}

	}

}
