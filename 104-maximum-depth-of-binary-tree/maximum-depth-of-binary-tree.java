class Solution {
    int ans = 0;
    public int maxDepth(TreeNode root) {
        
        height(root);
        return ans;
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
       
        int right = height(root.right);
        

        

        return ans = Math.max(left,right)+1;
    }
}