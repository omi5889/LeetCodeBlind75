package problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P207CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] linkCounts = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        setupAdj(linkCounts,adj,prerequisites);
        int count = getCourseCount(linkCounts, adj);
        return count==numCourses;
    }

    private void setupAdj(int[] linkCounts, List<List<Integer>> adj, int[][] prerequisites) {
        for(int[] req: prerequisites) {
            linkCounts[req[0]]++;
            adj.get(req[1]).add(req[0]);
        }
    }

    private int getCourseCount(int[] linkCounts, List<List<Integer>> adj) {
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<linkCounts.length; i++) {
            if(linkCounts[i]==0) {
                q.offer(i);
            }
        }
        while(!q.isEmpty()) {
            int curr = q.poll();
            count++;
            for(int k: adj.get(curr)) {
                linkCounts[k]--;
                if(linkCounts[k]==0) {
                    q.offer(k);
                }
            }
        }
        return count;
    }
}
