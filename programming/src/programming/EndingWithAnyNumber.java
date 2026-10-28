package programming;

import java.util.Scanner;

public class EndingWithAnyNumber {
	// we can ckeck any number ending with any number example 1007,102 .condistion is n%10==7 and n%10==2 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		int n=scan.nextInt();
		
		if(n%10==0)
		{
			System.out.println("yes number ending with Zero");
		}
		if(n%100==29)// this means it will give last 2 number
			//example 337384783 the last 2 two number 83 
			// if you want last 3 or 4 digit, you can use the logic n%1000 or n%10000
			// one more if you want to remove last digit we can foloow the same logic 
			//if number is less then diveder means 7/10 answer will be 0 and one more 7%10 answer will be 7 only
			
		{
			System.out.println("Last Two number");
			
			
		}
		

	}

}
