public class ArmstrongNo {

    static void armstrongNo(int n) {
        int temp = n;
        int m = n;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }

        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += (int) Math.pow(rem, count);
            temp /= 10;
        }
        if (sum == m) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");

        }
    }

    public static void main(String[] args) {
        armstrongNo(153);
        armstrongNo(1233);

    }
}
