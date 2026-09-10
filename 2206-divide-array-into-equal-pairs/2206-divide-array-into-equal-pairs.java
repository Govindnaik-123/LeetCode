class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()%2!=0){
                return false;
            }
        }
        return true;
    }
}