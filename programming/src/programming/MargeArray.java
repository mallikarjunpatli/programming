package programming;
import java.util.Scanner;
public class MargeArray {
 
	static int[] get(int []a1,int []a2)
	{
		int []res=new int [a1.length+a2.length];
		int i=0,j=0,k=0;
		while(i<a1.length &&  j<a2.length)
		{
			
			if(a2[j]<=a1[i])
			{
				res[k]=a2[j];
				k++;
				j++;
			}
			else 
			{
				res[k]=a1[i];
				k++;
				i++;
			}
			
		}
		while(j<a2.length)
		{
			res[k]=a2[j];
			k++;
			j++;
		}
		while(i<a1.length)
		{
			res[k]=a1[i];
			k++;
			j++;
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	int n1=scan.nextInt();

	int []a1=new int [n1];
	
	for(int i=0; i<a1.length;i++)
	{
		a1[i]=scan.nextInt();
	}
	
	int n2=scan.nextInt();

	int []a2=new int [n2];
	
	for(int i=0; i<a2.length;i++)
	{
		a2[i]=scan.nextInt();
	}
	
	
	
	
	int []res=get(a1,a2);
	
	for(int k=0; k<res.length; k++)
	{
	System.out.print(res[k]+" ");	
	}
	}
}

