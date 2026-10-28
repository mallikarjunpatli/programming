package programming;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the nomerator");
			int a=scan.nextInt();
			System.out.println("Enter the denomerator:");
			int b=scan.nextInt();
			System.out.println(a/b);
			System.out.println("Normal termination:");
			
			System.out.println("Enter the size:");
			
			int size=scan.nextInt();
			
			int []arr=new int [size];
			
			System.out.println("Enter the data:");
			int Data=scan.nextInt();
			
			System.out.println("Enter the Index:");
			int Index=scan.nextInt();
			
			arr[Index]=Data;
			arr=null;
			System.out.println(arr[Index]);

				}
		
		catch(ArithmeticException e)
		{
			System.out.println("Give correct Number");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Be positive");	
		}
		catch(InputMismatchException e)
		{
		System.out.println(" Input Mismatch");	
		}
		catch(NegativeArraySizeException e)
		{
		System.out.println("Give Non Zero number");	
		}
		
		catch(Exception e)
		{System.out.println("Normal ternmination ");
			
		}
		}

		
		
	}
	

	
	




