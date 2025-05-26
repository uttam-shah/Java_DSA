package BasicSorting;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,5,7,8,10};
        int [] arr2 = {3,9,12,18,};

        print(arr);
        print(arr2);
        int[] ans = merge(arr, arr2);
        print(ans);
    }

    public static int[] merge(int[] arr, int[]arr2){
        int[] ansArr = new int[arr.length + arr2.length];

        int i = 0; // idx of arr
        int j = 0; // idx of arr2
        int r = 0; // idx of ansArr
        while (i<arr.length && j<arr2.length){
            if(arr[i] < arr2[j]) ansArr[r++] = arr[i++];
            else ansArr[r++] = arr2[j++];
        }

        // put remaining element from arr
        while (i < arr.length) ansArr[r++] = arr[i++];

        // put remaining element from arr2
        while (j < arr2.length) ansArr[r++] = arr2[j++];
        return ansArr;
    }

    public static void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
