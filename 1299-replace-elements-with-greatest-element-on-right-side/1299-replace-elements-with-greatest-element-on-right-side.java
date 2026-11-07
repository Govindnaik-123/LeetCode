class Solution {
    public int[] replaceElements(int[] arr) {
        
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int max=-1;
            if(i==arr.length-1){
                res[i]=-1;
                return res;
            }
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(max,arr[j]);
                res[i]=max;
            }
        }
        return res;
    }
}