package problems;

import java.util.Arrays;
import java.util.Comparator;

public class P435NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int prev_end = intervals[0][1];
        for(int i=1; i<intervals.length; i++) {
             if(prev_end > intervals[i][0]) {
                 res++;
             } else {
                 prev_end = intervals[i][1];
             }
         }
        return res;
    }
}
