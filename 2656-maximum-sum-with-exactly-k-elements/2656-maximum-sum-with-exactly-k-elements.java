class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        sum=max;
        for(int i=1;i<k;i++){
            
            sum=sum+(max+i);
        }
        return sum;
    }
}