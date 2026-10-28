package programming;

import java.util.Scanner;
public class SubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the k value:");
		
		int k=sc.nextInt();
		
		for(int size=1; size<=n;size++)
		{
			for (int i = 0; i<=n-size; i++) 
			{
				int sum=0;
				for (int j=i; j<i+size; j++) 
				{
					sum+=arr[j];
					if(sum==k)
					{
						for (int start=i; start<=j; start++)
						{
						System.out.print(arr[start]+" ");
						}
						System.out.println();
					}
					
				}
			}

		}
	}
}



