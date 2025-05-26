package BasicSorting;

public class BubbleSort {
    public static boolean isShorted(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    public static boolean isDec(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2};
        printArr(arr);
        //bubbleSort(arr);
        //printArr(arr);
        decOrder(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr){
        for (int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        // Bubble Short
        for(int x=0; x<n-1; x++){  // n-1 pass
            for(int i=0; i<n-1-x; i++){
                if (arr[i] > arr[i+1]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            if (isShorted(arr)) break;
        }
    }

    public static void decOrder(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if (arr[j] < arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (isDec(arr)) break;
        }
    }
}
