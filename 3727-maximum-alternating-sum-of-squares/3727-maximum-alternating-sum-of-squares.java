class Solution {
    public long maxAlternatingSum(int[] nums) {
        long a[]=new long[nums.length];
        int j=0;
        for(int i:nums){
            a[j++]=(long)i*i;
        }
        Arrays.sort(a);
        int x=0;
        int y=nums.length-1;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(x<=y){
            if(i%2==0){
                sum=sum+(long)a[y];
                y--;
            }else{
                sum=sum-(long)a[x];
                x++;
            }
            }
        }
        return sum;

    }
}