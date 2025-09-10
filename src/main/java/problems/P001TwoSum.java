package problems;

import java.util.HashMap;
import java.util.Map;

public class P001TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(hmap.get(target-nums[i])!=null) {
                return new int[]{hmap.get(target-nums[i]), i};
            }
            hmap.put(nums[i], i);
        }
        return res;
    }
}
