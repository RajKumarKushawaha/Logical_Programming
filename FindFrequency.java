// Find the frequency of each element in an array

import java.util.Arrays;

public class FindFrequency {

    static void findFrequency(int[] arr) {
        Arrays.sort(arr);

        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + "->" + count);
                count=1;
            }
        }
        System.out.println(arr[arr.length - 1] + "->" + count);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 5, 5, 3, 12, 8, 6, 1, 2, 5 };
        findFrequency(arr);
    }
}
