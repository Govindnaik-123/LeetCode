class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int res[]=new int[gain.length+1];
        int j=0;
        res[j++]=sum;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            res[j++]=sum;
        }
        int max=Integer.MIN_VALUE;
        for(int i:res){
            if(max<i){
                max=i;
            }
        }
        return max;
    }
}