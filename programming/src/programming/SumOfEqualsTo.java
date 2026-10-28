package programming;
import java.util.Scanner;

public class SumOfEqualsTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int k = scan.nextInt();
        boolean found = false;
        
        // Try all possible subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                
                if (sum == k) {
                    found = true;
                    for (int x = i; x <= j; x++) {
                        System.out.print(arr[x] + " ");
                    }
                    System.out.println();
                }
            }
        }
        
        if (!found) {
            System.out.println("None");
        }
        
        scan.close();
    }
}
