package programming;
import java.util.Scanner;

public class MutipleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	int n1=scan.nextInt();

	int []a=new int [n1];
	
	for(int i=0; i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	
	int n2=scan.nextInt();

	int []b=new int [n2];
	
	for(int i=0; i<b.length;i++)
	{
		b[i]=scan.nextInt();
	}

	int n3=scan.nextInt();

	int []c=new int [n3];
	
	for(int i=0; i<c.length;i++)
	{
		c[i]=scan.nextInt();
	}
	
	
	int []MarrageArray=new int [a.length+b.length+c.length];
	

	int index=0;
	for(int i=0; i<a.length;i++)
	{
		MarrageArray[index++]=a[i];
	}
	for(int i=0; i<b.length;i++)
	{
		MarrageArray[index++]=b[i];
		
	}
	for(int i=0; i<c.length;i++)
	{
		MarrageArray[index++]=c[i];
	}
	
	for( index=0; index<MarrageArray.length; index++)
	{
		System.out.print(MarrageArray[index]+" ");
	}
	}
	}



