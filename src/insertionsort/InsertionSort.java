package insertionsort;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {9,8,7,15,14,2,5};

        insertionSort(arr);


    }

    public static int[] insertionSort(int arr[]){

        int j = 0,k = 1,temp = 0;

        for(int i = 1; i < arr.length;i++){

            j = i - 1;
            k = arr[i];

            while(j >= 0 && k < arr[j]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }

        }
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+", ");
        }



        return arr;

    }

}
