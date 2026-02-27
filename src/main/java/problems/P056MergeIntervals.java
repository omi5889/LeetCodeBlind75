package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P056MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] prev = intervals[0];

        for(int i=1; i<intervals.length; i++) {
            int[] interval = intervals[i];
            if(interval[0]<= prev[1]) {
                prev[1] = Math.max(interval[1], prev[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }
        merged.add(prev);

        return merged.toArray(new int[merged.size()][]);
    }
}
