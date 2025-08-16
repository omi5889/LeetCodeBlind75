package problems;

import java.util.HashSet;
import java.util.Set;

public class P003LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s==null) return 0;
        if(s.length()<=1) return s.length();
        Set<Character> hset = new HashSet<>();
        int l = 0;

        int res = 0;
        for(int r=0; r<s.length(); r++) {
            char c = s.charAt(r);
            if(hset.contains(c)) {
                while(hset.contains(c)) {
                    hset.remove(s.charAt(l));
                    l++;
                }

            }
            hset.add(c);
            res = Math.max(res, r-l+1);
        }

        return res;

    }
}
