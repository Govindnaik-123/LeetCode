class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k] && j-i==k-j && map.get(nums[i])==3){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}