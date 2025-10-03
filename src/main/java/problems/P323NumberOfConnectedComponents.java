package problems;

import java.util.ArrayList;
import java.util.List;

public class P323NumberOfConnectedComponents {
    private List<List<Integer>> adj;
    private boolean[] visited;
    public int countComponents(int n, int[][] edges) {
        int res = 0;
        adj = new ArrayList<>();
        visited = new boolean[n];
        for(int i=0; i<n; i++) {
            adj.add(new ArrayList<>());
        }

        // generate adjacency list
        for(int[] edge: edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        for(int node=0; node<n; node++) {
            res += dfs(node);
        }

        return res;
    }

    private int dfs(int node) {
        if(visited[node]) {
            return 0;
        }
        visited[node] = true;
        for(int neighbor: adj.get(node)) {
            dfs(neighbor);
        }
        return 1;
    }
}
