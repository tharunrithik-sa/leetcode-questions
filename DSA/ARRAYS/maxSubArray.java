class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(sum==0){
                start = i;
            }
            sum+=nums[i];
            if(sum>maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;

            }

            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}