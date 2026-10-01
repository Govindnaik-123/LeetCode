class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        int res[]=new int[nums.length];
        int lsum=0;
        int rsum=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            int temp=lsum;
            lsum=lsum+nums[i];
            l[i]=temp;
        }
        for(int i=nums.length-1;i>=0;i--){
            int temp=rsum;
            rsum=rsum+nums[i];
            r[i]=temp;
        }
        for(int i=0;i<nums.length;i++){
            res[i]=Math.abs(l[i]-r[i]);
        }
        return res;

    }
}