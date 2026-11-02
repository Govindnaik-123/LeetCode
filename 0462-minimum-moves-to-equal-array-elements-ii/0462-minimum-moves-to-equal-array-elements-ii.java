class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int diff=n/2;
        int sum=0;
        for(int i:nums){
            sum=sum+Math.abs(nums[diff]-i);
        }
        return sum;
    }
}