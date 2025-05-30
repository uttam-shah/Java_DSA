package Recursion;

import java.util.Scanner;

public class Fibonachi {
    public static int fib(int n){
        if (n == 0 || n ==1) return n;

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
