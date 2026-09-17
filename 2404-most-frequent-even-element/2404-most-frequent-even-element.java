class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=-1;
        int key=-1;
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getKey()%2==0){
                int val1=e.getValue();
                if(max<val1){
                    max=val1;
                    key=e.getKey();
                }
                if(val1==max){
                    key=Math.min(key,e.getKey());
                }

            }
        }
        return key;
    }
}