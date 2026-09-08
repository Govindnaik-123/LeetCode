class Solution {
    public int countCommas(int n) {
        int c=0;
        if(n<1000){
            return 0;
        }else if(n>=1000 && n<=100000 ) {
           int i=1000;
        while(i<=n){
            c=c+1;
            i++;
        }
        }
        return c;
    }
}