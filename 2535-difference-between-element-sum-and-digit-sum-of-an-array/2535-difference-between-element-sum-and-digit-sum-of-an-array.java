class Solution {
    public int differenceOfSum(int[] nums) {
        int dsum=0;
        int esum=0;
        for(int i:nums){
            dsum=dsum+i;
            while(i>0){
                int r=i%10;
                esum=esum+r;
                i=i/10;
            }
        }
        return Math.abs(esum-dsum);
    }
}