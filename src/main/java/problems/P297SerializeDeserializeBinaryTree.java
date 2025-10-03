package problems;

import util.TreeNode;

public class P297SerializeDeserializeBinaryTree {
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        sb.setLength(sb.length()-1);
        return sb.toString();
    }

    private void helper(TreeNode root, StringBuilder sb) {
        if(root==null) {
            sb.append("N").append(",");
            return;
        }
        sb.append(root.val).append(",");
        helper(root.left,sb);
        helper(root.right,sb);
    }

    public TreeNode deserialize(String data) {
        if(data==null || data.trim().isEmpty()) return null;
        String[] tokens = data.split(",");
        return createTree(tokens);
    }

    int index = 0;

    private TreeNode createTree(String[] tokens) {
        if(tokens[index].equals("N")) {
            index++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(tokens[index]));
        index++;
        node.left = createTree(tokens);
        node.right = createTree(tokens);
        return node;
    }


}
