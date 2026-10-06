class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
         HashMap<Integer,Integer>first=new HashMap<>();
          HashMap<Integer,Integer>last=new HashMap<>();
          int count=0;
        for(int i=0;i<nums.length;i++){
            if(!first.containsKey(nums[i])){
                first.put(nums[i],i);
            }
            last.put(nums[i],i);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int j:map.keySet()){
        if(last.get(j)-first.get(j)+1==map.get(j))
        count++;
        }
        
        return count;
    }
}