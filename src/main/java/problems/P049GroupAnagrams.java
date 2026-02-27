package problems;

import java.util.*;

public class P049GroupAnagrams {
    // Method 1: Using sorting of arrays
    public List<List<String>> groupAnagrams1(String[] strs) {
        Map<String,List<String>> hmap = new HashMap<>();
        for(String str: strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String key = Arrays.toString(temp);
            if(!hmap.containsKey(key)) {
                hmap.put(key, new ArrayList<>());
            }
            hmap.get(key).add(str);
        }
        return new ArrayList<>(hmap.values());
    }

    // Method 2: Using temporary arrays
    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String,List<String>> hmap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.setLength(0);
            int[] temp = new int[26];
            Arrays.fill(temp,0);
            String formatedStr = str.toLowerCase();
            for(char c: formatedStr.toCharArray()) {
                temp[c-'a']++;
            }
            for (int j : temp) {
                sb.append(j).append("#");
            }
            String key = sb.toString();
            if(!hmap.containsKey(key)) {
                hmap.put(key, new ArrayList<>());
            }
            hmap.get(key).add(str);

        }
        return new ArrayList<>(hmap.values());
    }
}
