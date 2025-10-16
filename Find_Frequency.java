// Find the frequency of characters in a string
// Count occurrences.
// Example: "apple" → {a:1, p:2, l:1, e:1}

public class Find_Frequency {

    static void find_Frequency(String str) {

        char[] arr1 = str.toCharArray();
        char[] arr2 = str.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            int c = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    c++;
                    arr2[j] = '\0';
                }
            }
            if (c > 0) {
                System.out.println(arr1[i] + "->" + c);
            }

        }
    }

    public static void main(String[] args) {
        String str = "applleee";
        find_Frequency(str);
    }
}
