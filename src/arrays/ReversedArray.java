package arrays;

import java.util.Random;

public class ReversedArray {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        System.out.print("Initial array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(20)+1;
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        System.out.print("Reversed array: ");
        int[] reversed = reversedArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(reversed[i] + ", ");
        }
    }

    public static int[] reversedArray(int arr[]){
        int n = arr.length - 1;

        for(int i = 0;i < arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
        return arr;
    }

}
