class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            int count1=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[j-1]){
                    count1++;
                }else{
                    break;
                }
            }
              maxcount=Math.max(maxcount,count1);
            
        }
        for(int i=0;i<nums.length;i++){
            int count2=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[j-1]){
                    count2++;
                }else{
                    break;
                }
               
            }
              maxcount=Math.max(maxcount,count2);
        }
        return maxcount;
    }
}