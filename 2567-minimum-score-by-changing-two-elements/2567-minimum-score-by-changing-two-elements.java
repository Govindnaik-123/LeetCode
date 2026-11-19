class Solution {
    public int minimizeSum(int[] nums) {

        Arrays.sort(nums);
       int n=nums.length;
       int res=Integer.MAX_VALUE;
       res=Math.min(res,nums[n-1]-nums[2]);
       res=Math.min(res,nums[n-2]-nums[1]);
       res=Math.min(res,nums[n-3]-nums[0]);
       return res;
    }
}