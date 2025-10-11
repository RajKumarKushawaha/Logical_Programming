// Evil Number
// A number whose binary representation has an even number of 1s.
// Example: 9 → binary 1001 → two 1s (even)

public class EvilNo {

       // METHOD 1

    // static int binaryNumber(int n) {
    //     int pow = 0;
    //     int binary = 0;
    //     while (n > 0) {
    //         int rem = n % 2;
    //         binary = binary + (rem * (int) Math.pow(10, pow));
    //         pow++;
    //         n /= 2;
    //     }
    //     return binary;
    // }

    // static void evilNumber(int n){
    //     int m = binaryNumber(n);
    //     int count=0;
    //     while(m>0){
    //         int rem = m%10;
    //         if(rem == 1){
    //             count++;
    //         }
    //         m/=10;
    //     }
    //     if(count % 2 == 0){
    //         System.out.println(n+" : Evil Number");
    //     }
    //     else{
    //         System.out.println(n+" : Not a Evil Number");
    //     }
    // }


        // METHOD 2

    static void evilNumber(int n){
        int temp = n;
        int count=0;
        while(n>0){
            int rem = n%2;
            if(rem == 1){
                count++;
            }
            n/=2;
        }
        if(count%2 == 0){
            System.out.println(temp+" : Evil Number");
        }
        else{
            System.out.println(temp+" : Not a Evil Number");
        }
    }

    public static void main(String[] args) {
        evilNumber(16);
    }
}
