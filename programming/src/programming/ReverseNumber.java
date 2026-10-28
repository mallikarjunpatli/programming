package programming;

public class ReverseNumber {
    public static void main(String[] args) {

        int n = 123;
        int k = 0;   // initialize

        while (n > 0) {
            int c = n % 10;
            k = k * 10 + c;   // correct logic
            n = n / 10;
        }

        System.out.println(k);
    }
}
