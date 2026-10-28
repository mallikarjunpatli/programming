package programming;
import java.util.Scanner;
public class ThreeArrayMarge {
 
	static int[] get(int []a,int []a1,int []a2)
	{
		int []res=new int [a.length+a1.length+a2.length];
		int l=0,i=0,j=0,k=0;
		while(l<a.length && i<a1.length &&  j<a2.length)
		{
			res[k]=a[l];
				k++;
				l++;
				
			res[k]=a1[i];
				k++;
				i++;
				
			res[k]=a2[j];
				k++;
				j++;
		}
			
		while(l<a.length)
		{
			res[k]=a[l];
			k++;
			l++;
		}
		while(i<a1.length)
		{
			res[k]=a1[i];
			k++;
			i++;
		}
		while(j<a2.length)
		{
			res[k]=a2[j];
			k++;
			j++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();

	int []a=new int [n];
	
	for(int l=0; l<a.length;l++)
	{
		a[l]=scan.nextInt();
	}
	
	int n1=scan.nextInt();

	int []a1=new int [n1];
	
	for(int i=0; i<a1.length;i++)
	{
		a1[i]=scan.nextInt();
	}
	
	int n2=scan.nextInt();

	int []a2=new int [n2];
	
	for(int j=0; j<a2.length;j++)
	{
		a2[j]=scan.nextInt();
	}
	
	
	
int []res=get(a,a1,a2);
	
	for(int k=0; k<res.length; k++)
	{
	System.out.print(res[k]+" ");	
	}
	
	}
}



