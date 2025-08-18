package problems;

public class P242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] cindex = new int[26];

        for(char c: s.toCharArray()) {
            cindex[c - 'a']++;
        }

        for(char c: t.toCharArray()) {
            if(cindex[c - 'a']==0) return false;
            cindex[c - 'a']--;
        }
        return true;
    }
}
