class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<nums.length;i++){
            int prod=1;
            long res1=nums[i];
            long res2=nums[i];
            for(int j=i;j<nums.length;j++){
                prod=prod*nums[j];
                res1=gcd(res1,nums[j]);
                res2=lcm(res2,nums[j]);
                int c=j-i+1;
                if(prod==res1*res2){
                max=Math.max(max,c);
            }

            }
            
        }
        return max;
    }
     static long gcd(long a,long b){
                    while(b!=0){
                        long temp=b;
                        b=a%b;
                        a=temp;
                    }
                    return a;
                }
                static long lcm(long a,long b){
                    return (a/gcd(a,b))*b;
                }
}