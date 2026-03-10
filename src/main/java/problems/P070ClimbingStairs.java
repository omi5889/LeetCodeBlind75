package problems;

import java.util.HashMap;
import java.util.Map;

public class P070ClimbingStairs {
    Map<Integer, Integer> hmap = new HashMap<>();
    public int climbStairs(int n) {
        if(n<=2) return n;
        if(hmap.containsKey(n)) return hmap.get(n);
        int res = climbStairs(n-1) + climbStairs(n-2);
        hmap.put(n, res);
        return res;
    }
}
