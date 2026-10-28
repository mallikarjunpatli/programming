package programming;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {1,2,3,4,5,7,8};
		
		int n=8;
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
		sum+=a[i];	
		}
		int exspection =n * (n + 1) / 2-sum;
		
		
		
		System.out.println(exspection);
		

	}

}
