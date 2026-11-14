class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        if(nums.size()<l){
            return -1;
        }
        boolean foundsubarray=false;
        for(int i=0;i<nums.size();i++){
            int currsum=0;
            for(int j=i;j<nums.size();j++){
                currsum=currsum+nums.get(j);
                int currlen=j-i+1;
                if(currlen>r){
                    break;
                }
                if(currlen>=l && currsum>0){
                    min=Math.min(min,currsum);
                    foundsubarray=true;
                }
            }
        }
        return foundsubarray?min:-1;
    }
}