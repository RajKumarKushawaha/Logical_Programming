public class LargestElement {

    static int maxElement(int[] arr){
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] n = {1,5,7,9,41,1,3,25,6,1,12,31,8,2};
        System.out.println(maxElement(n));
    }
}
