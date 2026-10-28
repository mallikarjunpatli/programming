package programming;
import java.util.Scanner;
public class HCFalsoNameGCD {
	// greatest comman devicer(GCD)
	// highest comman factor(HCF)
	
	//70 20
	//70%20=10
	//10 20
	//20%10=0
	//10 0 any of answer is  0 stop in
	// answer is 10

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HCFalsoNameGCD  m=new HCFalsoNameGCD();
		
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int min=m.get(a,b);
		
		for(int i=min; i>1; i--)
		{
			if(a%i==0 && b%i==0)
			{
				System.out.println(i);
				break;
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
