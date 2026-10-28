package programming;

import java.util.Scanner;

public class EvenSubarray {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n1 = sc.nextInt();
	        int[] arr = new int[n1];

	        for (int i = 0; i < n1; i++) {
	            arr[i] = sc.nextInt();
	        }

    		boolean found = false;

	        // Check ALL subarrays
	        for (int start = 0; start < n1; start++) {
	            int sum = 0;

	            for (int end = start; end < n1; end++) {
	                sum += arr[end];

	                if (sum % 2 == 0) {
	                    found = true;

	                    for (int i = start; i <= end; i++) {
	                        System.out.print(arr[i] + " ");
	                    }
	                    System.out.println();
	                }
	            }
	        }

	        if (!found) {
	            System.out.println("None");
	        }
	    }
	}
