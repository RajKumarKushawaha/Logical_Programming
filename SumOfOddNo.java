public class SumOfOddNo {

    static int sum(int n){
        int sum=0,rem=0;
        while(n>0){
            rem=n%10;
            if(rem % 2 != 0){
                sum+=rem;
            }
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sum(1325783));
    }    
}
