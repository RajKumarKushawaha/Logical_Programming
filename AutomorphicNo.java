public class AutomorphicNo {

    static void automorphicNo(int n) {
        int powerNo = n * n;
        int temp = n;
        boolean flag = true;

        while (n > 0) {
            if (n % 10 != powerNo % 10) {
                flag = false;
                break;
            }
            n /= 10;
            powerNo /= 10;
        }
        if (flag) {
            System.out.println(temp +" : Automorphic Number");
        } else {
            System.out.println(temp +" : Not a Automorphic Number");

        }

    }

    public static void main(String[] args) {
        automorphicNo(6);     
        automorphicNo(3);
        automorphicNo(25);
        automorphicNo(4);

    }
}
