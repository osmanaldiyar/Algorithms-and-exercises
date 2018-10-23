package arrays;

import java.util.Random;

public class FindAverage {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(20)+1;
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        System.out.println("The average is: " + average(arr));
    }

    public static int average(int[] arr){

        int average,n = arr.length,sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        average = sum / n;

        return average;
    }
}
