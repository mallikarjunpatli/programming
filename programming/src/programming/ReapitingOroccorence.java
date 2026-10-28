package programming;

public class ReapitingOroccorence {
	
	    public static void main(String[] args) {

	        int[] a = {4, 3, 2, 7, 8, 2, 3, 1,4,6,9,2};

	        for (int i = 0; i < a.length; i++) {

	            for (int j = 0; j < i; j++) {
	            	
	                if (a[i] == a[j]) {
	                    System.out.print(a[i] + " ");
	                    a[j] = Integer.MIN_VALUE; // so it won’t match again
	                    break;
	                }
	            }
	        }
	    }
	}



