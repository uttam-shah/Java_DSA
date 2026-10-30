package TwoDimensionalArr;

public class SpiralMatrix {

    static void main() {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9},
                       {10,11,12}};

        printWave(arr);

    }

    static void printWave(int[][] arr){

        boolean isReverse = false;

        for(int i=0; i<arr.length; i++){

            //print right
            if(!isReverse) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                //pring left
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }

            isReverse = !isReverse;

        }
    }

    static void printSpiral(int[][] arr){

    }
}
