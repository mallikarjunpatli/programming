package programming;
import java.util.Scanner;
public class UpToNPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for(int i=2; i<=n; i++)
		{
		int count=0;
		for(int j=1;j<=i; j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		
		if(count==2)
			{
			System.out.println(i);
			}
		
			}

	}
}


