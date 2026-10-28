package programming;
import java.util.Scanner;
public class SORTEDARRAY {

	public static boolean get(int []a)
	{

		
		for(int i=0; i<a.length-1;i++)
		{
			while(i<a.length-1) 
			{
			if(a[i]<a[i+1])
			{
				
			}
			else		
			{
				return false;
			}
			}
		}return true;
		
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int []a=new int [n];
		

		for(int i=0; i<a.length;i++)
		{
			a[i]=scan.nextInt();
		
		}
		
		System.out.println(get(a)?"sorted array":"not sorted array");

		
	}

}
