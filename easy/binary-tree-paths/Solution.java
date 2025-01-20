
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        findPaths(root, new StringBuilder(), paths);
        return paths;
    }

    private void findPaths(TreeNode node, StringBuilder path, List<String> paths) {
        int len = path.length(); // Save the current length of the path
        path.append(node.val); // Append the current node value

        if (node.left == null && node.right == null) {
            // Leaf node, add path to the list
            paths.add(path.toString());
        } else {
            // Non-leaf node, continue the path
            path.append("->");
            if (node.left != null) {
                findPaths(node.left, path, paths);
            }
            if (node.right != null) {
                findPaths(node.right, path, paths);
            }
        }

        // Backtrack to the previous state
        path.setLength(len);
    }
}

/*
 * /**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 * 
 * class Solution {
 * public List<String> binaryTreePaths(TreeNode root) {
 * List<String> paths = new ArrayList<>();
 * if (root == null) {
 * return paths;
 * }
 * findPaths(root, "", paths);
 * return paths;
 * }
 * 
 * private void findPaths(TreeNode node, String path, List<String> paths) {
 * if (node.left == null && node.right == null) {
 * 
 * paths.add(path + node.val);
 * } else {
 * 
 * if (node.left != null) {
 * findPaths(node.left, path + node.val + "->", paths);
 * }
 * if (node.right != null) {
 * findPaths(node.right, path + node.val + "->", paths);
 * }
 * }
 * }}
 * 
 */