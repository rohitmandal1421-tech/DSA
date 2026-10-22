class Solution {
            int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return ans;
    }
        public int diameter(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = diameter(root.left);
        int right = diameter(root.right);

        ans = Math.max(ans,left+right);

        return Math.max(left,right)+1;

    }
}