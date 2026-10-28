package PracticePrograms;

public class countNumber {


	public static void main(String args[])
	{
		int n=5;

		int count1=0;
		int m=0;

		for(int i=2;count1<n; i++)
		{

			System.out.println(checkPrime(i));

			count1++;
		}
	}
		static int checkPrime(int k)
		{
			int count=0;

			for(int i=1;i<=k;i++)
			{
				if(k%i==0)
				{
					count++;
				}

			}
			if(count==2)
			{
				return k;
			}
			return 0;

		}
	}
