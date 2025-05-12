package Recursion;

public class Parentheses {
    public static void generaate(int n, String ans, int open, int close){
        if (ans.length() == n*2){
            System.out.println(ans);
            return;
        }

        if (close < open){
            generaate(n, ans+")", open, close+1);
        }
        if (open < n){
            generaate(n, ans+"(", open+1, close);
        }

    }
    public static void main(String[] args) {
        int n = 5;
        generaate(n, "",0,0);
    }
}
