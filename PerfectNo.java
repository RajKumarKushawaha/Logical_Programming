// Perfect Number
// A number equal to the sum of its proper divisors.
// Example: 28 → 1+2+4+7+14 = 28

public class PerfectNo {

    static void perfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n + " : Perfect Number");
        } else {
            System.out.println(n + " : Not a Perfect Number");
        }
    }

    public static void main(String[] args) {
        perfectNumber(28);
        perfectNumber(12);
        perfectNumber(20);
    }
}
