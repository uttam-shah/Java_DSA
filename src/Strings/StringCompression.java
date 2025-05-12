package Strings;

public class StringCompression {
    public static String compress(String s){
        String ans = "";
        int i=0;
        int j=0;
        while (j < s.length()){

            if (s.charAt(i) == s.charAt(j)){
                j++;
            }else {
                ans += s.charAt(i);
                int len = j-i;
                if (len > 1) {
                    ans += len;
                }
                i=j;
            }
        }
        ans += s.charAt(i);
        int len = j-i;
        if (len > 1) {
            ans += len;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "aaaabbcddeff";

        System.out.println(compress(s));
    }
}
