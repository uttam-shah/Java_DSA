package Recursion;

import java.util.Scanner;

public class hcfRec {
    public static int hcf(int a, int b){
        for (int i= Math.min(a,b); i> 0; i--){
            if (a%i ==0 && b%i ==0){
                return i;
            }
        }
        return 1;

    }

    public static int hcfLongDivision( int a, int b){
        if (b%a == 0){
            return a;
        }
        return hcfLongDivision(b%a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println(hcfLongDivision(a,b));
    }
}
