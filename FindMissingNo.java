// Find the missing number in a sequence (1 to n).

public class FindMissingNo {

    static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int total = (n *(n + 1))/2;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return total - sum;

    }

    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6,7,9};
     System.out.println(missingNumber(arr));
    }
}
