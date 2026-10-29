class Solution {
    public int findClosestNumber(int[] nums) {
       int min=Integer.MAX_VALUE;
       ArrayList<Integer>res=new ArrayList<>();
       int ans=Integer.MIN_VALUE;
       for(int i:nums){
        min=Math.min(min,Math.abs(i));
       }
       for(int i=0;i<nums.length;i++){
        if(min==Math.abs(nums[i])){
            res.add(nums[i]);
        }
       }
       for(int i:res){
        ans=Math.max(ans,i);
       }
       return ans;
    }
}