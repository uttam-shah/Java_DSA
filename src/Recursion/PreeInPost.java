package Recursion;

public class PreeInPost {
    public static void pip(int n){
        if (n==0) return;
        System.out.println("pree : "+n);
        pip(n-1);
        System.out.println("in: "+n);
        pip(n-1);
        System.out.println("post: "+n);
    }
    public static void main(String[] args) {
        pip(3);
    }
}
