public class ReverseArray {

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(end > start){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            end--;
            start++;
        }
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,6,7,8,9,10};
          reverseArray(arr);
    }
}
