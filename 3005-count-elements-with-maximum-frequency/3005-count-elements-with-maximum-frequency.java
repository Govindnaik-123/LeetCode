class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            max=Math.max(max,e.getValue());
        }
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            if(max==e.getValue()){
                sum=sum+e.getValue();
            }
        }
        return sum;
    }
}