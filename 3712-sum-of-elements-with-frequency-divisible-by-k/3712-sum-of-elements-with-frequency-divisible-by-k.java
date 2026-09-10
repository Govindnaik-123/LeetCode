class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()%k==0){
                sum=sum+(e.getKey()*e.getValue());
            }
        }
        return sum;
    }
}