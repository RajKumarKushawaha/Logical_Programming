// Strong Number
// A number in which the sum of the factorial of digits equals the number.
// Example: 145 → 1! + 4! + 5! = 145

public class StrongNo {

     static int factorial(int m){
            int fact=1;
            for(int i=1; i<=m; i++){
                fact*=i;
            }
            return fact;
        }

    static void strongNo(int n){
        int sum=0,temp=n;
        while (n>0) {
            int rem = n%10;
            sum+=factorial(rem);
            n/=10;
        }
        if(sum == temp){
            System.out.println(temp +" : Strong Number");
        }
        else{
            System.out.println(temp +" : Not a Strong Number");

        }
    }

    public static void main(String[] args) {
        strongNo(145);
        strongNo(146);
    }
}
