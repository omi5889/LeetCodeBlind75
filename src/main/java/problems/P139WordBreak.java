package problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P139WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> hset = new HashSet<>(wordDict);
        int maxLen = 0;
        for(String str: wordDict) {
            maxLen = Math.max(maxLen, str.length());
        }
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        for(int i=1; i<=n; i++) {
            for(int j=i-1; j>=Math.max(0,i-maxLen); j--) {
                if(dp[j] && wordDict.contains(s.substring(j,i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
