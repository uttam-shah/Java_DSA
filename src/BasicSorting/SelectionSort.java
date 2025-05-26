package BasicSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2};
        printArr(arr);
        selectionSort2(arr);
        printArr(arr);
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i=0; i<n; i++){
            int smallest = i;
            for(int j=i+1; j<n; j++){
               if (arr[j] < arr[smallest]){
                   smallest = j;
               }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    private static void selectionSort2(int[] arr) {
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            int greatest=0;
            for(int j=1; j<n-i; j++){
                if (arr[j] > arr[greatest]){
                    greatest = j;
                }
            }
            //swap
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[greatest];
            arr[greatest] = temp;
        }
    }

    public static void printArr(int[] arr){
        for (int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
