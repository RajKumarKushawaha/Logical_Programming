// Check if a string is a palindrome
// Compare string with reverse.
// Example: "madam"

public class PalindromeString{

    static void palindrome_String(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str+" : Palindrome String");
        }
        else{
            System.out.println(str+" : Not a Palindrome String");
        }
    }
    public static void main(String[] args) {
        String str = "rajar";
        palindrome_String(str);
    }
}