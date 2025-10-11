// Triangular Number
// A number that can form an equilateral triangle (sum of first n natural numbers).
// Example: 6 = 1+2+3

public class TriangularNo {

    static void triangularNumber(int n){
        int sum=0;
        int i=1;
        while(sum<n){
            sum+=i;
            i++;
        }
        if(sum == n){
            System.out.println(n+" : Triangular Number");
        }
        else{
            System.out.println(n+" : Not a Triangular Number");
        }
    }
    public static void main(String[] args) {
        triangularNumber(9);
    }
}
