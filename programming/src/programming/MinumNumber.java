package programming;
import java.util.Scanner;

public class MinumNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); 
		MinumNumber m=new MinumNumber();
		
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		int min=m.get(x,y);
		
		System.out.println(min);
	}
		 public int get(int a, int b)
		{
			
		if(a<b)
		{
			return a;
		}
		else
		{
			return b;
		}
		
	   }
}
