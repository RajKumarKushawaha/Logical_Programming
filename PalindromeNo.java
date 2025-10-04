public class PalindromeNo {

    static void palindromeNo(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }

        if (temp == rev) {
            System.out.println(temp + " : Palindrome Number");
        } else {
            System.out.println(temp + " : Not a Palindrome Number");

        }
    }

    public static void main(String[] args) {
        palindromeNo(12321);
        palindromeNo(12345);
        palindromeNo(1234321);
    }
}
