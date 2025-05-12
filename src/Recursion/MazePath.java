package Recursion;

import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;

public class MazePath {
    public static int mazePath(int sr, int sc, int n, int m){
        if (sr == n || sc == m){
            return 1;
        }
        if (n < m) return 0;
        if (m < n) return 0;

        return mazePath(sr+1, sc,n, m) + mazePath(sr, sc+1,n, m);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows  and columns");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println("Enter the number of rows  and columns");
        int m = sc.nextInt();
        System.out.println(mazePath(1,1,n, m));
    }
}
