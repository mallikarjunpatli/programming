package programming;
import java.util.Scanner;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		
		int arr[]= new int[n];
		System.out.println("Enter the element");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondLargest=max;
				max=arr[i];
			}
			else if(arr[i]>secondLargest)
			{
				secondLargest=arr[i];
			}
		}
		System.out.println("secound largest Element is : "+secondLargest);

	}

}
