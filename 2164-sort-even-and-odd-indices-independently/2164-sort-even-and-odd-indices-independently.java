class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int h,l;
        if(n%2==0){
            h=n/2;
            l=n/2;
        }else{
            h=n/2+1;
            l=(n/2);
        }
        int res[]=new int[n];
        int e[]=new int[h];
        int j=0,k=0;
        int o[]=new int[l];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
            e[j++]=nums[i];
            }else{
                o[k++]=nums[i];
            }
        }
        Arrays.sort(e);
        Arrays.sort(o);
        int x=0,y=n/2-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                res[i]=e[x++];
            }else{
                res[i]=o[y--];
            }
        }
        return res;
    }
}