class Solution {
    int ans = 0;
    
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        Path(root,targetSum);

        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);

        return ans;
    }
    public void Path(TreeNode root, long targetSum){
        if(root == null){
            return;
        }
        targetSum = targetSum - root.val;

        if(targetSum == 0){
            ans ++;
        }
        Path(root.left,targetSum);
        Path(root.right,targetSum);

    }
}