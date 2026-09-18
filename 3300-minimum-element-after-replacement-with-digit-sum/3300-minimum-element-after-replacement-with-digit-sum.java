class Solution {
    public int minElement(int[] nums) {
        int a[] =new int[nums.length];
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            int b=nums[i];
            while(b>0){
                int r=b%10;
                sum=sum+r;
                b=b/10;
            }
            a[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i:a){
            min=Math.min(min,i);
        }
        return min;
    }
}