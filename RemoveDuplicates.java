// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. 
// Return k after placing the final result in the first k slots of nums.
// Example : [1,1,1,2,2,2,4,5,5,6]
// output:8 , [1,1,2,2,4,5,5,6]

public class RemoveDuplicates {

    static int removeSomeDuplicates(int[] arr){
        int n = arr.length;
        if(n <= 2){
            return n;
        }
        int index = 2;
        for(int i=2; i<n; i++ ){
            if(arr[i] != arr[index-2]){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i=0; i<index; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,4,5,5,6};
        System.out.println("length : "+ removeSomeDuplicates(arr));
    }
}
