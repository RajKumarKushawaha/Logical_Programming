// Happy Number
// A number that eventually reaches 1 when replaced by the sum of the squares of its
// digits repeatedly.
// Example: 19 → 1²+9²=82 → 8²+2²=68 → 6²+8²=100 → 1

public class HappyNo {

    static boolean happyNumber(int n) {
        boolean flag = false;
        if (n == 1) {
            return true;
        }
        if (n == 4) {
            return false;
        }
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, 2);
            n /= 10;
        }

        return happyNumber(sum);
    }

    public static void main(String[] args) {
        if (happyNumber(37)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
}
