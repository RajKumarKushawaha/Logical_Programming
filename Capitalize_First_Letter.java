//  Convert string to title case
// Capitalize first letter of each word.
// Example: "hello world" → "Hello World" ✅

public class Capitalize_First_Letter {

    static void capital_first_letter(String str){
        String[] str1 = str.split(" ");
        for(int i=0; i<str1.length; i++){
            if(str1[i].charAt(0) >= 97 && str1[i].charAt(0) <= 122){
                str1[i].charAt(0)-=32;
            }
        }
        for(int i=0; i<str1.length; i++){
            System.out.print(str1[i]+ " ");
        }
    }
    public static void main(String[] args) {
        String str = "hello word";
        capital_first_letter(str);
    }
}
