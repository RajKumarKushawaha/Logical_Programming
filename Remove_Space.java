// Remove all white spaces from a string
// Example: "a b c" → "abc"

public class Remove_Space {

    static void remove_Space(String str){
        String str1 = "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                continue;
            }
            str1+=str.charAt(i);
        }
        System.out.println(str1);
    }
    public static void main(String[] args) {
        String str = "He l l o";
        remove_Space(str);
    }
}
