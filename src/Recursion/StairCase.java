package Recursion;

import java.util.Scanner;

public class StairCase {
    public static int stair(int n){
        if (n == 1) return n;
        if (n == 3) return 2;
        if (n == 2) return 1;

        return stair(n-1) + stair(n-3);
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stair(n));
    }
}
