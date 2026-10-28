package programming;
import java.util.Scanner;

public class AllPosibleSubArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		
		int arr[]= new int[n];
		System.out.println("Enter the elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int size=1; size<n;size++)
		{
			for(int i=0; i<=arr.length-size;i++)
			{
			for(int j=i; j<i+size;j++)
				{
				System.out.print(arr[j]+" ");
				}
			System.out.println();
			}
		}	}

}
