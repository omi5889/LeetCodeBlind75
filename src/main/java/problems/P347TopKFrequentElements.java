package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> fmap = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num:nums) {
            fmap.put(num, fmap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] farr = new ArrayList[nums.length+1];
        for(int num: fmap.keySet()) {
            int freq = fmap.get(num);
            if(farr[freq]==null) {
                farr[freq] = new ArrayList<>();
            }
            farr[freq].add(num);
        }

        for(int i = farr.length-1 ; i>=0; i--) {
            if(farr[i] != null) {
                for(int j=0; j<farr[i].size() && k>0; j++) {
                    res.add(farr[i].get(j));
                    k--;
                }
            }
            if(k==0) {
                break;
            }
        }

        int[] resarr = new int[res.size()];
        for(int i=0; i<res.size(); i++) {
            resarr[i] = res.get(i);
        }
        return resarr;
    }
}
