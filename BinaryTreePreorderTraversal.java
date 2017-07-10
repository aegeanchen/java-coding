/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return list;
    }
    
    public void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        list.add(node.val);
        if(node.left != null){
            preOrder(node.left);
        }
        if(node.right != null){
            preOrder(node.right);
        }
    }
}