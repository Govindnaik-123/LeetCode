class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            int x=0;
        }
        long a=n;
        long  d=0;
        long x=0;
        long sum=0;
        while(a>0){
            long r=a%10;
            if(r!=0){
             d=d*10+r;
            }
            a=a/10;
        }
        while(d>0){
            long r=d%10;
            x=x*10+r;
            sum=sum+r;
            d=d/10;
            
        }
        return x*sum;
    }
}