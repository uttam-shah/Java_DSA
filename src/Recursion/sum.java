package Recursion;

import java.util.Scanner;

public class sum {
    public static int sumn(int n){
        if (n == 1 || n == 0) return n;
        return n + sumn(n-1);
    }

    public static void  sumn(int n, int sum){
        if (n == 0){
            System.out.println(sum);
            return;
        }
        sumn(n-1, n+sum );
    }


    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println("The sum from 1 to "+n+" is: "+ sumn(n));
        sumn(n, 0);
    }
}
