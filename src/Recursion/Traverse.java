package Recursion;

public class Traverse {
    public static void strTravWithoutA(int i, String str){
        if (i == str.length()) return;
        if (str.charAt(i) != 'a') {
            System.out.print(str.charAt(i) + " ");
        }
        strTravWithoutA(i+1, str);
    }

    public static void strTrav(int i, String str){
        if (i == str.length()) return;
        System.out.print(str.charAt(i)+ " ");
        strTrav(i+1, str);
    }
    public static void traverse(int i, int[] arr){
        if (i == arr.length) return;
        System.out.print(arr[i]+ " ");
        traverse(i+1, arr);
    }
    public static void main(String[] args) {

        int arr[] = {7,5,6,4,6,7,4,6};
        //traverse(0, arr);

        String str = "Uttam Shah";
        //strTrav(0, str);
        strTravWithoutA(0, str);
    }
}
