class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        int res=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=min && nums[i]!=max){
                res=nums[i];
            }
        }
        return res;
    }
}