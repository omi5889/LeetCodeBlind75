package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P269AlienDictionary {
    Map<Character, List<Character>> hmap = new HashMap<>();
    Map<Character, Boolean> seen = new HashMap<>();
    StringBuilder sb = new StringBuilder();

    public String alienOrder(String[] words) {
        for(String word: words) {
            for(char c: word.toCharArray()) {
                hmap.putIfAbsent(c,new ArrayList<>());
            }
        }

        for(int i=0; i< words.length-1; i++) {
            String w1 = words[i];
            String w2 = words[i+1];

            if(w1.length() > w2.length() && w1.startsWith(w2)) {
                return "";
            }

            for(int j=0; j<Math.min(w1.length(),w2.length()); j++) {
                if(w1.charAt(j) != w2.charAt(j)) {
                    hmap.get(w2.charAt(j)).add(w1.charAt(j));
                    break;
                }
            }

        }

        for(Character c: hmap.keySet()) {
            boolean res = dfs(c);
            if(!res) return "";
        }

        if(sb.length() < hmap.size()) {
            return "";
        }

        return sb.toString();
    }

    private boolean dfs(Character c) {
        if(seen.containsKey(c)) {
            return seen.get(c);
        }
        seen.put(c, false);
        for(Character next: hmap.get(c)) {
            boolean res = dfs(next);
            if(!res) return false;
        }
        seen.put(c, true);
        sb.append(c);
        return true;

    }
}
