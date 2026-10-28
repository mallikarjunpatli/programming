package programming;
import java.util.Scanner;

public class LongestSubArrayWithSumEqualsToK {

    static void findSmallestSubarray(int[] arr, int k) {
        int n = arr.length;
        int minLen = n + 1;
        int startIndex = -1;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k && (j - i + 1) < minLen) {
                    minLen = j - i + 1;
                    startIndex = i;
                }
            }
        }

        if (startIndex == -1) {
            System.out.println("No subarray found.");
        } else {
            for (int i = startIndex; i < startIndex + minLen; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        findSmallestSubarray(arr, k);
    }
}
