class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int res=0;
        int n=nums.length/2;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>n){
                res=e.getKey();
            }
        }
        return res;
    }
}