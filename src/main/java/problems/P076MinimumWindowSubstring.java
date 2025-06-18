package problems;

import java.util.*;

public class P076MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        Map<Character,Integer> have = new HashMap<>();
        Map<Character,Integer> need = new HashMap<>();
        if(t.length()>s.length()) return "";

        int minWindow = s.length()+1;
        int start = 0;
        int end = 0;
        int left = 0;
        int haveLen = 0;
        int needLen = t.length();

        for(int i=0; i<t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i),0)+1);
            have.put(t.charAt(i),0);
        }

        for(int right=0; right<s.length(); right++) {
            char curr = s.charAt(right);

            if(need.get(curr)==null) continue;
            have.put(curr, have.get(curr)+1);
            if(need.get(curr)!=null && have.get(curr) <= need.get(curr)) {
                haveLen++;
            }
            while(haveLen==needLen) {
                char cleft = s.charAt(left);
                if(right-left+1 < minWindow) {
                    start = left;
                    end = right;
                    minWindow = right - left + 1;
                }
                if(have.get(cleft)!=null) {
                    have.put(cleft, have.get(cleft)-1);
                }
                if(need.get(cleft)!=null && have.get(cleft) < need.get(cleft)) {
                    haveLen--;
                }
                left++;
            }
        }
        return minWindow==s.length()+1 ? "" : s.substring(start,end+1);
    }
}
