package arrays;

public class ScalarMultiplicationOfMatrix {

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int[][] arr2 = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};

        System.out.println("array1: ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4;j++){
                System.out.print(arr1[i][j]+", ");
            }System.out.println();
        }
        System.out.println("array2: ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4;j++){
               System.out.print(arr2[i][j]+", ");
            }System.out.println();
        }

        int[][] c = new int[4][4];


        c = multiply(arr1,arr2,4);
        System.out.println("Multiplication : ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4;j++){
                System.out.print(c[i][j]+", ");
            }System.out.println();
        }

    }


    private static int[][] multiply(int[][] arr, int[][] arr2, int n) {

        int c[][] = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                for(int k = 0;k < n;k++){
                    c[i][j] += arr[i][k] * arr2[k][j];
                }

            }
        }

        return c;

    }

}
