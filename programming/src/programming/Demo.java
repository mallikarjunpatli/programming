package programming;

public class Demo {

	public static void main(String[] args) {
		int n=10;
		int m=10;
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<m;j++) 
			{
				if(i==0 || i==9 || j==0 || j==9)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
