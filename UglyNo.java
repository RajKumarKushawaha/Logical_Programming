// Ugly Number
// A number whose prime factors are only 2, 3, or 5.
// Step-by-Step Process
// Start with a number n.
// Keep dividing by 2 as long as the number is divisible by 2 (n % 2 == 0).
// Then divide by 3 as long as divisible by 3.
// Then divide by 5 as long as divisible by 5.
// After these divisions, check the result:
// If n == 1 → all prime factors were 2, 3, or 5 → Ugly Number.
// If n > 1 → it has some other prime factor → Not Ugly.
// Example: 30 → factors (2,3,5)

public class UglyNo {
    static void uglyNumber(int n){
        int temp = n;
        if(n<=0){
            System.out.println(temp+" : Not a Ugly Number");
            return;
        }
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }

        if(n == 1){
            System.out.println(temp+" : Ugly Number");
        }
        else{
            System.out.println(temp+" : Not a Ugly Number");
        }
    }
    public static void main(String[] args) {
        uglyNumber(13);
    }
}
