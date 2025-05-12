package Recursion;

import java.util.Scanner;

public class Power {
    public static int power(int a, int b){  // Tc = 0(b)
        if (a == 0 && b==0) {
            System.out.println("Not defined");
            return 0;
        }
        if (b == 0) return 1;  //base case
        return a * power(a,b-1);  //kaam call
    }

    public static int powerL(int a, int b){  //Tc = 0(log b)
        if (a == 0 && b ==0){
            System.out.println("Not Defined");
            return 0;
        }
        if (b<=0) return 1;
        int c = power(a, b/2);
        if (b%2 == 0) return c * c;
        return c*c*a;

    }
    public static void main(String[] args) {
        System.out.println("Enter the value of a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println(powerL(a,b));
    }
}
