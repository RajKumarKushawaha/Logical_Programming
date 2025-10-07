// Pronic Number (or Oblong Number)
// A number that is the product of two consecutive integers.
// Example: 12 = 3×4

public class PronicNo {

    static void pronicNumber(int n) {
        boolean flag = false;

        for (int i = 1; i < n; i++) {
            if (i * (i + 1) == n) {
                flag = true;
                System.out.println(i + " * " + (i+1) + " = " + n + " , Pronic Number");
                break;
            }
        }
        if (!flag) {
            System.out.println("Not Pronic Number");
        }
    }

    public static void main(String[] args) {
        pronicNumber(12);
        pronicNumber(13);

    }
}
