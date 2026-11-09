class Solution {
    public int totalHammingDistance(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                sum=sum+hamming(nums[i],nums[j]);
            }
        }
       return sum;
        
    }
     public int hamming(int x,int y){
        return Integer.bitCount(x^y);
       } 
}