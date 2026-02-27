package problems;

public class P152MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int min = nums[0];
        int max = nums[0];
        int res = max;
        for(int i=1; i<nums.length; i++) {
            int curr = nums[i];
            int tempMax = max * curr;
            int tempMin = min * curr;
            max = Math.max(curr, Math.max(tempMax, tempMin));
            min = Math.min(curr, Math.min(tempMax, tempMin));
            res = Math.max(res,max);
        }
        return res;
    }
}
