// A number is Kaprekar if the square of the number, when split into two parts, adds up to
// the original number.
// Example: 45 → 45² = 2025 → 20 + 25 = 45

public class KaprekarNo {

    static boolean kaprekarNumber(int n) {
        if (n == 1)
            return true;
        int temp = n;
        int power = n * n;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }

        int fact = 1;
        for (int i = 1; i <= count; i++) {
            fact *= 10;
        }
        int right = power % fact;
        int left = power / fact;
        return (left + right == temp);
    }

    public static void main(String[] args) {
        for(int i=1; i<1000;i++){
           if(kaprekarNumber(i)){
            System.out.print(i+",");
           }
        }
    }
}
