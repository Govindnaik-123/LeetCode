class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i:nums){
            int count=0;
            while(i>0){
                count++;
                int r=i%10;
                i=i/10;
            }
            if(count%2==0 && count!=0){
                res++;
            }
        }
        return res;
    }
}