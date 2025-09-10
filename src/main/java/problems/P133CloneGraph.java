package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P133CloneGraph {

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }


    Map<Integer,Node> hmap = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null) return node;
        if(hmap.get(node.val)!=null) return hmap.get(node.val);
        Node clonedNode = new Node(node.val);
        hmap.put(clonedNode.val, clonedNode);
        for(Node neighbor: node.neighbors) {
            clonedNode.neighbors.add(cloneGraph(neighbor));
        }
        return clonedNode;
    }

}
