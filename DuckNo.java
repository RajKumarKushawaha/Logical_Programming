public class DuckNo {

    static void duckNo(int n){
        int fact=1,rem=0;
        while(n>0){
            rem=n%10;
            fact*=rem;
            n=n/10;
        }
        if(fact == 0){
            System.out.println("Duck No");
        }
        else{
            System.out.println("Not a Duck No");
        }
    }
    public static void main(String[] args){
        duckNo(12300234);
    }  
}
