// Count vowels and consonants in a string
// Check each char.
// Example: "hello" → vowels=2, consonants=3

public class CountVowel {

    static void count_Vowel(String str){
        String str1 = str.toLowerCase();
        int vow=0;
        int cons=0;

        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o'|| ch == 'u'){
                vow++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Vowels : "+ vow);
        System.out.println("Consonants : "+ cons);
    }
    public static void main(String[] args) {
        String str = "RajkumarKushawaha";
        count_Vowel(str);
    }
}
