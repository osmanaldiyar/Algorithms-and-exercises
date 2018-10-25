package Fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int n1 = 0; int n2 = 1;
        System.out.print(n1 + ", " + n2);
        fibonacci(n1,n2);
    }

    public static int fibonacci(int n1, int n2){
        int count = 5;

        int n3 = n1 + n2;

        System.out.print(", " + n3);

        if(n3 == count){
            return n3;
        }

        return fibonacci(n2,n3);
    }

}
