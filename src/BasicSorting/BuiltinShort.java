package BasicSorting;

import java.util.Arrays;

public class BuiltinShort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 8, 9, -4};
        printArr(arr);
        Arrays.sort(arr); // Built In shorting
        printArr(arr);
    }

    public static void printArr(int[] arr){
        for (int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
