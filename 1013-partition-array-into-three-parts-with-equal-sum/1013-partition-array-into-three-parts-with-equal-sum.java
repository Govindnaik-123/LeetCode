class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total=0;
        for(int i:arr){
            total=total+i;
        }
        if(total%3!=0){
            return false;
        }
        int sum=total/3;
        int count=0;
        int csum=0;
        for(int i:arr){
            csum=csum+i;
            if(csum==sum){
                count++;
                csum=0;
            }
        }
        return count>=3;
    }
}