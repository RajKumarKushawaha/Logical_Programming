// Find the longest word in a sentence
// Split and compare lengths.
// Example: "I love programming" → "programming"

public class Longest_Word {

    static void longest_word(String str){
        String[] str1 = str.split(" ");
        int maxl = 0;
        String result = " ";
        for(int i=0; i<str1.length; i++){
            if(maxl < str1[i].length()){
                maxl = str1[i].length();
                result = str1[i];
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "I love programming";
        longest_word(str);
    }
}
