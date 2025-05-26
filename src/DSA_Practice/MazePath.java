package DSA_Practice;

import java.util.ArrayList;

public class MazePath {
    public static ArrayList<String> fAns = new ArrayList<>();
    public static void main(String[] args) {

        int m = 3;
        int n = 7;
        solve(m, n, "");
        //return fAns.size();
        System.out.println(fAns.size());
    }

    public static void solve(int m, int n, String ans){
        // Base case
        if(m==1 && n==1){
            fAns.add(ans);
            System.out.println(ans);
            return;
        }

        if(m < 1 || n < 1){
            return;
        }
        //go right
        solve(m, n-1, ans+"R");

        //go down
        solve(m-1, n, ans+"D");


    }
}
