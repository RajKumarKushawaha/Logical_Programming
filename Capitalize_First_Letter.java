//  Convert string to title case
// Capitalize first letter of each word.
// Example: "hello world" → "Hello World" ✅

public class Capitalize_First_Letter {

    static void capital_first_letter(String str){
        String[] str1 = str.split(" ");
        String result = "";

        for(int i=0; i<str1.length; i++){
            char firstLetter = str1[i].charAt(0);
            if(firstLetter >='a' && firstLetter <='z'){
                firstLetter-=32;
            }
            str1[i] = firstLetter + str1[i].substring(1);
            result+=str1[i]+" ";
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str = "hi i am raj, how are you?";
        capital_first_letter(str);
    }
}
