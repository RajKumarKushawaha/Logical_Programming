public class Second_Largest {

    static void second_Largest(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int second_max = arr[arr.length-1];
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] < second_max) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 4, 2, 9, 6, 7, 3, 10};
        second_Largest(arr);
    }
}
