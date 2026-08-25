package DSA_150;

public class ArrayString {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,0,0,0};
//        int[] arr1 = new int[]{1,2,3};
        int n = 3;

        int[] arr2 = new int[]{2,5,6};
        int m = 3;

        printArr(arr1);
        System.out.println();
        merge(arr1, n, arr2, m);
        printArr(arr1);

    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }


    public static int[] merge(int[] nums1, int[] nums2){

        int i= 0;
        int j= 0;

        int[] ans = new int[nums1.length + nums2.length];
        int k = 0;


        while ( i < nums1.length && j < nums2.length){

            if(nums1[i] <= nums2[j] ){
                ans[k++] = nums1[i++];
            }
            else {
                ans[k++] = nums2[j++];
            }
        }

        return  ans;

    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] margedArr = new int [nums1.length];
        int idx = 0;

        int i = 0;
        int j = 0;

        while(i < m && j < n){

            if(nums1[i] < nums2[j]  ){
                margedArr[idx++] = nums1[i++];
            }
            else{
                margedArr[idx++] = nums2[j++];
            }
        }

        while (i < m){
            margedArr[idx++] = nums1[i++];
        }

        while (j < n){
            margedArr[idx++] = nums2[j++];
        }



        for(i=0; i<margedArr.length; i++){
            nums1[i] = margedArr[i];
        }

    }
}
