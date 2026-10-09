class Solution {
    public int maxProductDifference(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int x=0,y=0;

    for(int i=0;i<nums.length;i++){
        if(max1<nums[i]){
            max1=nums[i];
            x=i;
        }
        if(min1>nums[i]){
            min1=nums[i];
            y=i;
        }
    }
    for(int j=0;j<nums.length;j++){
        if(max2<nums[j] && nums[j]<=max1 && j!=x){
            max2=nums[j];
        }
        if(min2>nums[j] && nums[j]>=min1 && j!=y ){
            min2=nums[j];
        }
    }

    return (max1*max2)-(min1*min2);
    }
}