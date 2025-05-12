//package Recursion;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class Subsets {
//    public static void printSubsets(String str, String ans, int i){
//        //System.out.print(ans+ " ");
//        if (i == str.length()){
//            System.out.println(ans);
//            return;
//        }
//        printSubsets(str, ans+str.charAt(i), i+1);
//        printSubsets(str, ans, i+1);
//
//    }
//    public static void printStr(String str, int i){
//        if (i == str.length()) return;
//        System.out.print(str.charAt(i)+ " ");
//        printStr(str, i+1);
//    }
//
//    static List<String> ansLisa = new ArrayList<>();
//    public static List<String> subString(String str, String ans, int i){
//        if (i == str.length()){
//            ansLisa.add((ans));
//        }
//        printSubsets(str, ans+str.charAt(i), i+1);
//        printSubsets(str, ans, i+1);
//        return ansLisa;
//    }
//
//    public static void printList(List<String> list, int i){
//        if (i == list.size()) return;
//        System.out.println(list.get(i));
//        printList(list, i+1);
//    }
//
//    public static void main(String[] args) {
//        String str = "abc";
//        //printSubsets(str, "",0);
//        //printStr(str, 0);
//       // printList(subString(str,"", 0), 0);
//
//        int[] num = {1,2,3};
//        List<Integer> list = new ArrayList<>();
////        List<List<Integer>> dnum = new ArrayList<>();
////
////        // Add demo values
////        dnum.add(Arrays.asList(1, 2, 3));
////        dnum.add(Arrays.asList(4, 5, 6));
////        dnum.add(Arrays.asList(7, 8, 9));
////        dnum.add(Arrays.asList(10, 11, 12));
//
//
//
//        List<List<Integer>> ans = getList(num);
//        //printL(dnum, 0);
//        //System.out.println(dnum);
//    }
//
//    public static void printL (List<List<Integer>> list, int i){
//        if (i== list.size()) return;
//        System.out.println(list.get(i));
//        printL(list, i+1);
//    }
//
//    public static List<List<Integer>> getList(int[] num){
//
//        int[] ans = new int[0];
//        List<List<Integer>> fans = getAns(num, ans, 0 );
//        return fans;
//    }
//
//    public static List<List<Integer>> getAns(int[] num, int[] ans, int i){
//        if(i == num.length){
//
//        }
//    }
//}
