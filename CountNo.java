public class CountNo {

    static int countNo(int n){
        int count=0;
        
        while(n>0){
            n= n/10;
            count++;    
        }
        return count;

    }
    public static void main(String[] args){
        int n = 463663155;
        System.out.println("CountNumber : " + countNo(n));

    }
    
}
