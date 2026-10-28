package programming;
	import java.util.Scanner;
	public class FirstnThCommanMultipleNumber {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int a=scan.nextInt();
			int b=scan.nextInt();
			int count=0;
			for(int i=0; count<n; i++)
			{
				if(i%a==0 && i%b==0)
				{
					System.out.println(i);
					count++;
				}
			}

		}

	}