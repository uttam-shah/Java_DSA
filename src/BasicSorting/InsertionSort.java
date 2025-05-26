package BasicSorting;

import static BasicSorting.SelectionSort.printArr;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2};
        printArr(arr);
        insertingSort2(arr);
        printArr(arr);
    }

    public static void insertingSort(int[] arr){
        int n = arr.length;

        for (int i=1; i<n; i++){

            while (arr[i] < arr[i-1]){
                //swap
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                if(i>1)i--;
            }

        }
    }

    public static void insertingSort2(int[] arr){
        int n = arr.length;

        for (int i=1; i<n; i++){

            for (int j=i; j>=1; j--){
                if(arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }

        }
    }
}
