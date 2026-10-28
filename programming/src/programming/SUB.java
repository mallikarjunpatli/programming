package programming;
public class SUB {
	public static void main(String arg[])
	{
		int []arr= {-1,-2,-3,-4};
		
		for(int size=1; size<=arr.length; size++)
		{
			for (int i = 0; i <=arr.length-size; i++) 
			{
				int sum=0;
				
				for(int j=i; j< i+size; j++)
				{
					sum+=arr[j];
				}
				
					if(sum%2==0)
					{
						for(int m=i; m<i+size; m++)
						{
							System.out.print(arr[m]+" ");
						}
					
					
					System.out.println();
					}
					}
				}
				
			}

		}

	


