package programming;
import java.util.Scanner;
public class sca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=scan.nextInt();

		}
		int size = scan.nextInt();
		
		for (int i = 0; i <=arr.length-size; i++) 
		{	
			int sum=0;
			for(int j=i; j<i+size; j++)
			{
				sum+=arr[j];
			}
			System.out.println(sum);

		}
	}
}
		

		
	
		

