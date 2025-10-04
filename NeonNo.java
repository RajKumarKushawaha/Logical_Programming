public class NeonNo {

    static void neonNo(int n) {
        int powerNo = n*n;
        
        int sum = 0, rem = 0;
        while (powerNo > 0) {
            rem = powerNo % 10;
            sum += rem;
            powerNo = powerNo / 10;
        }
       if(sum == n){
        System.out.println("Neon Number");
       }
       else {
        System.out.println("Not a Neon number");
       }
    }

    public static void main(String[] args) {
        neonNo(9);
        neonNo(12);
    }
}
