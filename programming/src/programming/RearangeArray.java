package programming;
import java.util.Scanner;
public class RearangeArray {

	static void rearange(int []arr)
	{
		int i=arr.length-1,j=arr.length-1;
		while(i>=0)
		{
			if(arr[i]==-1)
			{
				i--;
			}
			else
			{
				arr[j]=arr[i];
				i--;
				j--;
			}
		}
		while(j>=0)
		{
			arr[j]=-1;
			j--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		rearange(arr);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");	
		}

	}

}
