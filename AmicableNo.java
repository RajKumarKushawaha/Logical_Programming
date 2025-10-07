// Friendly Pair (Amicable Numbers)
// Two numbers are amicable if the sum of divisors of one equals the other (excluding the
// number itself).
// Example: (220, 284)

public class AmicableNo {

    static void amicableNumber(int n, int m){
        int sum1 = 0;
        for(int i=1; i<=n/2; i++){
            if(n%i == 0){
                sum1+=i;
            }
        }
        int sum2 = 0;
        for(int i=1; i<=m/2; i++){
            if(m%i == 0){
                sum2+=i;
            }
        }
        if(sum1 == m && sum2 == n){
            System.out.println(n+" , "+m+ " : Amicable Number");
        }
        else{
            System.out.println(n+" , "+m+" : Not a Amicable Number");
        }
    }
    public static void main(String[] args) {
        amicableNumber(1184, 1210);
        amicableNumber(120, 220);
        amicableNumber(220, 284);
    }
}
