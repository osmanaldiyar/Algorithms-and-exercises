package gcd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCD {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter p: ");
            int p = Integer.parseInt(reader.readLine());
            System.out.println("Enter q: ");
            int q = Integer.parseInt(reader2.readLine());
            System.out.println(p + " | " + q);
            System.out.println("gcd.gcd is: " + gcd(p,q));
        }catch(Exception e){

        }

    }

    public static int gcd(int p, int q){

        if(q == 0){
            return p;
        }

        int r = p % q;
        if(r == 0){
            return q;
        }
        System.out.println(q + " | " + r);
        return gcd(q,r);
    }

}


