class Solution {
    public int smallestAbsent(int[] nums) {
        HashSet<Integer>set =new HashSet<>();
        int n=nums.length;
        int avg;
        int sum=0;
        for(int i:nums){
            sum=sum+i;
            set.add(i);
        }
        avg=sum/n;
        if(avg<=0){
            avg=1;
        }else{
            avg=avg+1;
        }
        while(avg<=100){
                if(!set.contains(avg)){
                    return avg;
                }
                avg=avg+1;
            }
        return avg;
        
    }
}