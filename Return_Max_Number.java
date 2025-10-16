// Return max number from the given number
// example -> 
// input = 451, 254
// output = 541, 542

import java.util.Arrays;

public class Return_Max_Number {

    static int max_Number(int n){
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String str2 = "";
        for(int i=arr.length-1; i>=0; i--){
            str2+=arr[i];
        }
        int sortNumber = Integer.parseInt(str2);

        return sortNumber;
    }
    public static void main(String[] args) {
        System.out.println(max_Number(19075));
    }
}
