class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int m=nums[i];
            int s=0;
            while(m>0){
                int r=m%10;
                    s=s+r;
                    m=m/10;
            }
            if(i==s){
                return i;
            }
        }
        return -1;
    }
}