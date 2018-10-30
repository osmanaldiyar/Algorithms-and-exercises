package selectionsort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5,6,3,19,2,9,10,72};

        selectionSort(arr);
    }

    public static void selectionSort(int arr[]){

        int minValue,minIndex,temp;

        for(int i = 0; i < arr.length; i++){
            minValue = arr[i];
            minIndex = i;

            for(int j = i; j < arr.length; j++){
                if(minValue > arr[j]){
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            if(minValue < arr[i]){
                temp = arr[i];
                arr[i] = minValue;
                arr[minIndex] = temp;
            }
            System.out.print(arr[i]+", ");
        }

    }


}
