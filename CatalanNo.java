// Catalan Numbers (Advanced)
// Used in combinatorics. Formula:
// Cₙ = (2n)! / (n+1)!n!

public class CatalanNo {

    static long factorial(int n){
        long fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    static long catalanNumber(int n) {
        long p = factorial(2*n);
        long q = factorial(n+1);
        long r = factorial(n);

        return p/(q*r);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("First "+ n + " Catalan Number");
        for(int i=0; i<n; i++){
          System.out.print(catalanNumber(i)+" ");

        }
    }
}
