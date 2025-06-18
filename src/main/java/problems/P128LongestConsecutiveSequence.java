package problems;

import java.util.HashSet;
import java.util.Set;

public class P128LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        if(nums==null) return 0;
        if(nums.length<=1) return nums.length;
        Set<Integer> hset = new HashSet<>();

        for(int num: nums) {
            hset.add(num);
        }

        for(int num: nums) {
            if(!hset.contains(num-1)) {
                int length = 1;
                while(hset.contains(num+length)) {
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }

        return ans;
    }
}
