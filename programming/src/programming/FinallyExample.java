package programming;
import java.util.Scanner;

public class FinallyExample {

	public static void main(String args[])
	{
		Scanner scan=null;
		
			try {
				 scan=new Scanner(System.in);
				int a=scan.nextInt();
				System.out.println(a);
			}
			
			finally
			{
				scan.close();
			}
	}
}
