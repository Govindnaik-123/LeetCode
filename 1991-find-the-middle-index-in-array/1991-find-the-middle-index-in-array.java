class Solution {
    public int findMiddleIndex(int[] nums) {
      int lsum=0;
      int rsum=0;
      int tsum=0;
      for(int i:nums){
        tsum=tsum+i;
      }
      rsum=tsum;
      for(int i=0;i<nums.length;i++){
        rsum=rsum-nums[i];
        if(lsum==rsum){
            return i;
        }else{
            lsum=lsum+nums[i];
        }
      } 
      return -1; 
    }
}