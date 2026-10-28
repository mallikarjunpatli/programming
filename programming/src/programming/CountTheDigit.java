package programming;
import java.util.Scanner;
public class CountTheDigit {
	
	
	 public int get(int n) {
		 int count=0;
		 
		 if(n==0)
		 {
			return 1; 
		 }
		while(n!=0) 
		{
			n=n/10;
			
				count++;
			
		}
			return count;		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountTheDigit m=new CountTheDigit();
		
		Scanner scan=new Scanner (System.in);
		int x=scan.nextInt();
		
		int s=m.get(x);
		
		
		System.out.println(s);
		
	}
		

}
