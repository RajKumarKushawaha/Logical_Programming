// Fascinating Number
// If a number multiplied by 2 and 3, and then concatenated, contains all digits from 1 to 9
// exactly once.
// Example: 192 → (192×1=192, 192×2=384, 192×3=576 → “192384576” contains 1–9)

import java.util.Arrays;

public class FascinatingNo {

    static void fascinatingNumber(int n){
        String allNumber = "123456789";
        int n1 = n;
        int n2 = n*2;
        int n3 = n*3;

        String allDigit = "" + n1 + n2 + n3 ;

        if(allDigit.length() != 9){
            System.out.println(n+" : is Not a fascinating number");
            return;
        }

        char[] digits = allDigit.toCharArray();
        Arrays.sort(digits);
        String result = new String(digits);

        if(result.equals(allNumber)){
            System.out.println(n + " is a Fascinating Number");
        } else {
            System.out.println(n + " is Not a Fascinating Number");
        }
    }
    public static void main(String[] args) {
        fascinatingNumber(192);
        fascinatingNumber(1351);
    }   
}
