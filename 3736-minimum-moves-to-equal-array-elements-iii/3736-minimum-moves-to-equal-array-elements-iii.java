class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(max<i){
                max=i;
            }
        }
        int sum=0;
        for(int i:nums){
            sum=sum+(max-i);
        }
        return sum;
    }
}