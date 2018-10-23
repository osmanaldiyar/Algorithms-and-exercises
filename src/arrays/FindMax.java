package arrays;
// Basic operations with arrays.FindMax

import java.util.Random;

public class FindMax {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(20)+1;
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        System.out.println("The max is: " + max(arr));
    }

    public static int max(int arr[]){

        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }

}
