// Sunny Number
// A number is Sunny if N+1 is a perfect square.
// Example: 8 → 8+1=9 → √9=3

class SunnyNo{

    static void sunnyNumber(int n){
        int m = (int)Math.sqrt(n+1);
        if(m*m == n+1){
            System.out.println(n+" : Sunny Number");
        }
        else {
            System.out.println(n+ " : Not a Sunny Number");
        }
    }
    public static void main(String[] args) {
       sunnyNumber(15);
    }
}