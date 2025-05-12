package Recursion;

public class Permutation {
    public static void permutation(String s, String ans){

        if (s.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i=0; i<s.length(); i++){

            String sn = s.substring(0, i) + s.substring(i + 1 );
            permutation(sn, ans + s.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s = "abcd";
        permutation(s, "");
    }
}
