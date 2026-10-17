package DSA_150;

public class Jump {

    static void main() {
        int[] arr = new int[]{2, 0};
        System.out.println(canJump(arr));
    }

    public static boolean canJump(int[] nums) {

        if(nums.length == 1){
            return true;
        }

        int i = 0;

        while(i < nums.length){

            System.out.println("i is: "+i);

            if(nums[i] == 0) break;

            if(i >= nums.length) return true;

            i = i + nums[i];

        }

        if(i >= nums.length) return true;

        return false;
    }
}
