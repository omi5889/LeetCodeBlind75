package problems;

public class P198HouseRobber {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int premax = 0;
        int currmax = 0;
        for(int num:nums) {
            int temp = currmax;
            currmax = Math.max(premax+num, currmax);
            premax = temp;
        }
        return currmax;
    }
}
