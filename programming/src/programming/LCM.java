package programming;

	import java.util.Scanner;
	public class LCM {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LCM m=new LCM();
			
			Scanner scan=new Scanner (System.in);
			int x=scan.nextInt();
			int y=scan.nextInt();
			int s=m.get(x,y);
			
			int g=(x*y)/s;
			System.out.println(g);
			
		}
			 public int get(int a,int b)
			{
			for(int i=a; i>1; i--)
			{
				if(a%i==0 && b%i==0)
				{
					return i;
				}
			}
				return 1;		
		}
	}



