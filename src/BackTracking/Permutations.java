package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static List<List<Integer>> fAns = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr));


    }

    public static List<List<Integer>> permute(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];
        fAns = new ArrayList<>();
        helper(nums, ans, isValid);
        return fAns;

    }

    public static void helper(int[] nums, ArrayList<Integer> ans, boolean[] isValid){

        if(nums.length == ans.size()){
            List<Integer> list = new ArrayList<>();
            for (int i=0; i<ans.toArray().length; i++){
                list.add(ans.get(i));
            }
            fAns.add(list);
            //System.out.println(ans);
            return;
        }

        for(int i=0; i<nums.length; i++){
            if (isValid[i] == false){
                ans.add(nums[i]);
                isValid[i] = true;
                helper(nums, ans, isValid );
                isValid[i] = false;
                ans.removeLast();
            }

        }
    }
}
