// Abundant Number
// A number where the sum of its divisors is greater than the number.
// Example: 12 → divisors 1+2+3+4+6 = 16 > 12

public class AbundantNo {

    static void abundantNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum > n) {
            System.out.println(n + " : Abundant Number");
        } else {
            System.out.println(n + " : Not a Abundant Number");

        }
    }

    public static void main(String[] args) {
        abundantNumber(12);
        abundantNumber(15);
        abundantNumber(10);
    }
}
