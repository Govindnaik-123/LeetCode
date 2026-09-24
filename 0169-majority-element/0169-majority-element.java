class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int key=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            if(max<e.getValue()){
                max=e.getValue();
                key=e.getKey();
            }
        }
        return key;
    }
}