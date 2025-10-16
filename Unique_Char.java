// Remove duplicate characters from a string
// Keep unique chars.
// Example: "programming" → "progamin

import java.util.Arrays;

public class Unique_Char {

    static void unique_Character(String str) {
        char[] str1 = str.toCharArray();
        Arrays.sort(str1);

        char[] str2 = new char[str1.length];
        int k = 0;
        
        for (int i = 0; i < str1.length-1; i++) {
            if (str1[i] != str1[i + 1]) {
                str2[k] = str1[i];
                k++;
            }
        }
        str2[k] = str1[str1.length-1];

        String result = "";
        for (int i = 0; i < str2.length; i++) {
            result += str2[i];
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "aambcmnbpba";
        unique_Character(str);
    }
}
