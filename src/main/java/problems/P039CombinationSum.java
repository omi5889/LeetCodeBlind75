package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P039CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,0,target,temp,res);
        return res;
    }

    public void helper(int[] nums, int index, int target, List<Integer> temp, List<List<Integer>> res) {
        if(target==0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index; i< nums.length; i++) {
            if(nums[i] > target) return;
            temp.add(nums[i]);
            helper(nums,i, target-nums[i], temp, res);
            temp.removeLast();
        }
    }
}
