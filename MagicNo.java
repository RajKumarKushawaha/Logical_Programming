// Magic Number
// A number is Magic if the recursive sum of its digits is 1.
// Example: 19 → 1+9=10 → 1+0=1

public class MagicNo {

    static boolean magicNumber(int n) {
        if (n == 1)
            return true;
        if (n < 10)
            return false;

        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return magicNumber(sum);
    }

    public static void main(String[] args) {
        int n = 10;
        if (magicNumber(n)) {
            System.out.println(n +" : Magic Number");
        } else {
            System.out.println(n +" : Not a Magic Number");
        }
    }
}
