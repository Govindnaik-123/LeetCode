class Solution {
    public int[] sumZero(int n) {
        
        int res[]=new int[n];
        if(n==1){
            res[0]=0;
            return res;
        }
        int m=n%2;
        int i=0;
        int j=1;
            while(i<n){
            res[i]=j;
            res[i+1]=-j;
            j++;
            i=i+2;
            if(i==n-1){
            break;}
            }
        if(m==1){
            res[n-1]=0;
        }
        return res;
    }
}