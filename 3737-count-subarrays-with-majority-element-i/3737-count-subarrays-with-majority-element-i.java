class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    c=c+1;
                }else{
                    c=c-1;
                }
                if(c>0){
                    res++;
                }
            }
        }
        return res;
    }
}