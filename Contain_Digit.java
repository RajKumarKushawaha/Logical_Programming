// Check if a string contains only digits
// Example: "12345" → Yes, "12a3" → No

public class Contain_Digit {

    static void contain_Digit(String str){
        boolean flag = false;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                flag = true;
            }
        }
        if(flag){
            System.out.println(str+" : Contain Digit");
        }
        else{
            System.out.println(str+" : Not Contain Digit");
        }
    }
    public static void main(String[] args) {
        String str = "AbdD";
        contain_Digit(str);
    }
}
