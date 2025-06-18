package problems;

import java.util.*;

public class P261GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1) return false;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges ) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        Stack<Integer> st = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        st.push(0);
        visited.add(0);

        while(!st.isEmpty()) {
            int node = st.pop();
            for(int neighbour: adj.get(node)) {
                if(visited.contains(neighbour)) {
                    continue;
                }
                visited.add(neighbour);
                st.push(neighbour);
            }
        }

        return visited.size()==n ;

    }
}
