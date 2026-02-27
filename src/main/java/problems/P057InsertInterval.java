package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P057InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[] > updated = new ArrayList<>();
        List<int[] > merged = new ArrayList<>();
        Collections.addAll(updated, intervals);
        updated.add(newInterval);
        updated.sort(Comparator.comparingInt(a -> a[0]));

        int[] prev = updated.getFirst();

        for(int i=1; i< updated.size(); i++) {
            int[] temp = updated.get(i);
            if(temp[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], temp[1]);
            } else {
                merged.add(prev);
                prev = temp;
            }
        }
        merged.add(prev);

        return merged.toArray(new int [merged.size()][]);
    }
}
