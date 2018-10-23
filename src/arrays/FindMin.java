package arrays;

import java.util.Random;

public class FindMin {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random rand = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10)+1;
            System.out.print(arr[i] + ", ");

        }
        System.out.println();

        System.out.println("Min is: " + min(arr));

    }

    public static int min(int[] arr){

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

}
