class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int pre=1;
        int suff=1;
        for(int i=0;i<nums.length;i++){
            res[i]=pre;
            pre=pre*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*suff;
            suff=suff*nums[i];
        }
        return res;
    }
}