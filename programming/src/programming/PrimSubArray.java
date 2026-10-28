import java.util.Scanner;

public class PrimSubArray {

    // check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int size = 1; size <= n; size++) {
            for (int i = 0; i <= n - size; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                    sum += arr[j];
                }

                if (isPrime(sum)) {
                    found = true;
                    // print without trailing space
                    for (int j = i; j < i + size; j++) {
                        if (j > i) System.out.print(" "); // space before element (not after last)
                        System.out.print(arr[j]);
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
