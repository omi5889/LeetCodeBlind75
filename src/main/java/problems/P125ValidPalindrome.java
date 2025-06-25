package problems;

public class P125ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==1) return true;
        String temp = s.trim().toLowerCase();
        int len = temp.length();
        char[] carr = temp.toCharArray();
        int j = 0;
        int k = len-1;
        while(j<k) {
            while(j<k && !Character.isLetterOrDigit(carr[j])) j++;
            while(j<k && !Character.isLetterOrDigit(carr[k])) k--;
            if(carr[j]!=carr[k]) return false;
            j++;
            k--;
        }
        return true;
    }
}
