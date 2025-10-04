// Harshad (Niven) Number
// A number divisible by the sum of its digits.
// Example: 18 → 1+8=9 → 18 % 9 = 0

public class HarshadNo {

    static void harshadNo(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        if (temp % sum == 0) {
            System.out.println(temp + " : Harshad Number(Niven Number)");
        } else {
            System.out.println(temp + " : Not a Harshad Number(Niven Number)");

        }
    }

    public static void main(String[] args) {
        harshadNo(18);
        harshadNo(12);
        harshadNo(15);
    }
}
