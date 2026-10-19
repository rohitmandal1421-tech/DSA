class Solution {
    public int rob(int[] nums) {
    int n = nums.length;

    if(n == 1){
        return nums[0];
    }

    int first = robRange(nums,0,n-2);
    int second = robRange(nums,1,n-1);

    return Math.max(first,second);
    }

public int robRange(int[] nums,int start,int end){

        int prev2 = 0;
        int prev1 = 0;

        for(int i=start;i<=end;i++){
        
            int sum = prev2 + nums[i];
            int skip = prev1;

            int curr = Math.max(sum,skip);

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
