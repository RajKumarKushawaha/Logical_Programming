// Reverse each word in a sentence
// Reverse word by word.
// Example: "Hello World" → "olleH dlroW"

public class Reverse_Each_Word {

    static void reverse_Each_Word(String str){

        String[] arr = str.split(" ");
        for(int i=0; i<arr.length; i++){
            String rev = "";
            for(int j=arr[i].length()-1; j>=0; j--){
                rev+=arr[i].charAt(j);
            }
            System.out.print(rev+" ");
        }
    }
    public static void main(String[] args) {
        String str = "Raj kumar";
        reverse_Each_Word(str);
    }
}
