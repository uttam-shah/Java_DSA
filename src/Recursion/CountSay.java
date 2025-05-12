package Recursion;

public class CountSay {
    public static String countAndSay(int n) {
        if (n == 1) return "1";
        String s = countAndSay(n-1);
        String ans = "";
        int i=0;
        int j=0;
        while (j<s.length()){
            if (s.charAt(i) == s.charAt(j)){
                j++;
            }
            else {
                ans += j-i;
                ans += s.charAt(i);
                i=j;
            }

        }
        ans += j-i;
        ans += s.charAt(i);
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
}
