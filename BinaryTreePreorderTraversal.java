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
    if(root == null) return list;
    list.add(root.val);
    list.addAll(preorderTraveral(root.left));
    list.addAll(preorderTraveral(root.right));
    return list;

}