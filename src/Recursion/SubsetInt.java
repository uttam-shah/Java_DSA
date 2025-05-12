package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetInt {
    static List<List<Integer>> ansList = new ArrayList<>();  //global
    public static void subSet(int[] nums, List<Integer> ans, int i ){

        if (i == nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for (int j=0; j<ans.size(); j++){
                list.add(ans.get(j));
            }
            ansList.add(list);
            return;
        }

        subSet(nums, ans, i+1); //not take
        ans.add(nums[i]);
        subSet(nums, ans, i+1); // take
        ans.removeLast();
    }
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        List<Integer> ans = new ArrayList<>();

        ansList = new ArrayList<>();
        subSet(nums,ans,0);
        System.out.println(ansList);
    }
}
