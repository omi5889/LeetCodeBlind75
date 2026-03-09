package problems;

public class P213HouseRobberII {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        return Math.max(rob(nums,0,nums.length-1), rob(nums,1,nums.length));
    }

    private int rob(int[] nums, int start, int end) {
        int premax = 0;
        int currmax = 0;
        for(int i=start; i<end; i++) {
            int temp = currmax;
            currmax = Math.max(premax+nums[i], currmax);
            premax = temp;
        }
        return currmax;
    }

}
