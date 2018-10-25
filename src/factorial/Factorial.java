package factorial;

public class Factorial {
    public static void main(String[] args) {
        factorial(5);
        System.out.println(factorial2(5));
    }

    public static void factorial(int n){

        int factorial = 1;

        for(int i = 2;i <= n;i++){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }

    public static int factorial2(int n){

        if(n == 0){
            return 1;
        }
        return n * factorial2(n-1);
    }
}
