package programming;
import java.util.Scanner;

public class ConjugetciveSubArray {
	
	public static void get(int []a)
	{
		int count=1,max=0;
		int si=0,ei=0;
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i+1]-a[i]==1)
			{
				count++;
			}
			else
			{
				if(count>max)
				{
					max=count;
					ei=i;
				}
				count=1;
			}
		}
		if(count>max)
		{
			max=count;
			ei=a.length-1;
			
		}
		 si=ei-max+1;
		for(int i=si; i<=ei; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=scan.nextInt();
		}
		get(arr);


	}

}
