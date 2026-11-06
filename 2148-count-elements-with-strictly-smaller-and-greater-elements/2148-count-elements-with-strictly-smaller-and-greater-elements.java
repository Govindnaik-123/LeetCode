class Solution {
    public int countElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i:nums){
            if(min>i){
                min=i;
            }
            if(max<i){
                max=i;
            }
        }
        for(int i:nums){
            if(i<max && i>min ){
                count++;
            }
        }
        return count;
    }
}