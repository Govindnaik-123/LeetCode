class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer>num1=new ArrayList<>();
        int count=0;
        int res=0;
        int max=0;
        for(int i:arr){
            num1.add(i);
            max=Math.max(max,i);
        }
        for(int i=1;i<=Integer.MAX_VALUE;i++){
            if(!num1.contains(i)){
                count++;
                if(count==k){
                    res=i;
                    break;
                }
            }
            
        }
        return res;
    }
}