public class ReverseNo{
    public static void main(String[] args) {
        int n=12345, revNo=0, rem=0;
        

        while(n>0){
            rem = n%10;
            revNo=(revNo*10)+rem;
            n=n/10;
        }
        System.out.println(revNo);
    }
}