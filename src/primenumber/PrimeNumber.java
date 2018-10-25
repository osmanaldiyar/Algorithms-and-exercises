package primenumber;

public class PrimeNumber {

    public static void main(String[] args) {

        for(int i = 0; i < 20;i++){
            System.out.println(i + " is prime: " + isPrime(i));
        }
    }

    public static boolean isPrime(int n){

        if(n == 0 || n == 1){
            return false;
        }

        for(int i = 2; i < n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
