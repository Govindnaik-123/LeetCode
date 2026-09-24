class Solution {
    public int thirdMax(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        boolean flag=false;
        for(int i :nums){
            if(max1<i){
                max1=i;
            }
        }
        for(int i :nums){
            if(max2<i && i<max1){
                max2=i;
            }
        }
        for(int i :nums){
            if(max3<=i && i<max1 && i<max2){
                max3=i;
                flag=true;
                }
                
            }
        if(max3==Integer.MIN_VALUE && !flag){
            return max1;
        }
    return max3;
    }
}