// Disarium Number
// A number is Disarium if the sum of its digits powered with their respective positions
// equals the number.
// Example: 135 → 1¹ + 3² + 5³ = 135

class DisariumNo {

    static int powerOfNumber(int n, int count){  
        int fact=1;    
        for(int i=1; i<=count; i++){
            fact*=n;
        }
        return fact;
    }

    static void disariumNumber(int n) {
        int count = 0, temp = n,m=n;
        while (n > 0) {
            count++;
            n /= 10;
        }

        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += powerOfNumber(rem, count);
            temp /= 10;
            count--;
        }
        if(sum == m){
            System.out.println("Disarium Number");
        }
        else{
            System.out.println("Not a disarium Number");
        }
    }

    public static void main(String[] args) {
        disariumNumber(135);
    }
}