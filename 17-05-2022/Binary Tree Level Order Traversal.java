/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        List<List<Integer>> listt=new ArrayList<>();
        if(root==null)
            return listt;
        while(!q.isEmpty()){
            Queue<TreeNode> temp=new LinkedList<TreeNode>();
            List<Integer> tempL=new ArrayList<>();
            temp.clear();
            while(!q.isEmpty()){
                TreeNode exploreNode=q.remove();
                tempL.add(exploreNode.val);
                if(exploreNode.left!=null)
                    temp.add(exploreNode.left);
                if(exploreNode.right!=null)
                    temp.add(exploreNode.right);
            }
            listt.add(tempL);
            q=temp;
        
        }
        return listt;
    }
}
