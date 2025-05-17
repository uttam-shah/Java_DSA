package BasicSorting;

public class CheckIfSorted {
    public static boolean isShorted(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {2,5,7,8,9, 12, 34};
        System.out.println(isShorted(arr));

    }
}
