public class SpyNo {

    static void spyNo(int n){
        int fact=1, rem=0,sum=0, temp=n;
        while (n>0) {
            rem=n%10;
            fact*=rem;
            sum+=rem;
            n=n/10; 
            }
            if(sum == fact){
                System.out.println( temp + " = Spy No");
            }
            else{
                System.out.println( temp + " = Not a Spy No");

            }
        }
    public static void main(String[] args){
        spyNo(12412);
    }
    
}
