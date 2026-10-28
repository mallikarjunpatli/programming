package programming;
import java.util.Scanner;

public class AramStrongNumber {
	public static int aramstrong(int n)
	{   int t=n;
		int count=0;
		while(t!=0)
		{
			t=t/10;
			count++;
		}
		
		t=n;
		int rev=0;
		while(t!=0) 
		{
		int last=t%10;
		rev=rev+(int)Math.pow(last, count);
		t=t/10;
		}
		return rev; 
	}
	

	public static void main(String[] args) 
	{
				Scanner scan=new Scanner(System.in);
				int m=scan.nextInt();
				int p=scan.nextInt();
				
				for(int i=m; i<=p; i++)
				{
				       int r= aramstrong(i);
				       if(r==i) {
				       System.out.println(i);
				       }
				}
				      
	}
}

		

	
