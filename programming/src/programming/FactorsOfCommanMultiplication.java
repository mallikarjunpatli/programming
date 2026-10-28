package programming;
import java.util.Scanner;
public class FactorsOfCommanMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorsOfCommanMultiplication m=new FactorsOfCommanMultiplication();
		
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int min=m.get(a,b);
		
		for(int i=1; i<=min; i++)
		{
			if(a%i==0 && b%i==0)
			{
				System.out.println(i);
			}
		}
		

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
