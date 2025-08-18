package problems;

import java.util.Arrays;

public class P238ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length <= 1) return nums;
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);

        int prod = 1;
        for(int i=0; i<nums.length; i++) {
            res[i] = prod * res[i];
            prod = prod * nums[i];
        }

        prod = 1;
        for(int i=nums.length - 1; i>=0; i--) {
            res[i] = res[i] * prod;
            prod = prod * nums[i];
        }
        return res;
    }
}
