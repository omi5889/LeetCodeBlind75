package problems;

public class P055JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int goal = nums.length - 1;
        int position = nums.length - 2;
        while(position>=0) {
            if(position + nums[position] >= goal) {
                goal = position;
            }
            position = position - 1;
        }
        return goal == 0;
    }
}
