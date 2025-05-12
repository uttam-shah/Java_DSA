package Recursion;

import java.util.Scanner;

public class BinaryStrings {
    public static void printWithoutConsicutive(int a, String ans){

        if (ans.length() == a){
            System.out.println(ans);
            return;
        }

        if (ans.isEmpty() || ans.charAt(ans.length()-1) == '0'){
            printWithoutConsicutive(a, ans+ 0);
            printWithoutConsicutive(a, ans+ 1);
        }else {
            printWithoutConsicutive(a, ans+ 0);
        }

    }
    public static void printSubset(String s, String ans, int i){
        if (s.length() == i){
            System.out.println(ans);
            return;
        }

        printSubset(s, ans, i+1);
        printSubset(s, ans+ s.charAt(i), i+1 );
    }
    public static void main(String[] args) {
        System.out.println("Enter a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printWithoutConsicutive(a, "");

//        String s = "abc";
//        printSubset(s, "", 0);
    }
}
