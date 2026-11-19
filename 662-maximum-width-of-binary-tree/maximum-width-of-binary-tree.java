class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        if(root == null)
        return 0;

        Queue<pair> queue = new LinkedList<>();
        queue.offer(new pair(root,0));

        int ans = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            int min = queue.peek().index;
            int first = 0;
            int last = 0;

            for(int i=0; i<size; i++){
                pair p = queue.poll();
                TreeNode node = p.node;
                int index = p.index - min;

                if(i == 0) first = index;
                if(i == size-1) last = index;

                if(node.left !=null)
                queue.offer(new pair(node.left,2*index+1));

                if(node.right !=null)
                queue.offer(new pair(node.right,2*index+2));
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
    class pair{
        TreeNode node;
        int index;

        pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
}