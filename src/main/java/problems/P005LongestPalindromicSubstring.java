package problems;

public class P005LongestPalindromicSubstring {
    int low, maxlen;
    public String longestPalindrome(String s) {
        if(s.isEmpty() || s.length() <= 1) return s;
        for(int i=0; i<s.length()-1; i++) {
            helper(s,i,i);
            helper(s,i,i+1);
        }
        return s.substring(low, low+maxlen);
    }

    private void helper(String s, int left, int right) {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        if(maxlen < right-left-1) {
            low = left+1;
            maxlen = right-left-1;
        }
    }
}
