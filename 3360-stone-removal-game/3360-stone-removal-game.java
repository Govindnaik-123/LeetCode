class Solution {
    public boolean canAliceWin(int n) {

        for(int i=10;i>=0;i--){
            if(i%2==0){
            int a=n-i;
            if(a<0){
                return false;
            }
            n=n-i;
            }
            else{
                int b=n-i;
            if(b<0){
                return true;
            }
            n=n-i;
        }
        }
        if(n<0){
            return false;
        }
        return true;
    }
}