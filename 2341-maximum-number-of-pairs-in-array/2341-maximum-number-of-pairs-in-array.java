class Solution {
    public int[] numberOfPairs(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int a[]=new int[2];
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
       } 
       int c=0;
       int sum=0;
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
           sum=sum+(e.getValue()/2);
           c=c+e.getValue()%2;
        }
        a[0]=sum;
        a[1]=c;
        return a;
    }
}