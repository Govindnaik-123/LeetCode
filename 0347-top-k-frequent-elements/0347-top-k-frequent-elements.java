class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int a[]=new int[k];
        for(int b:nums){
            map.put(b,map.getOrDefault(b,0)+1);
        }
        ArrayList<Integer>c=new ArrayList<>(map.keySet());
        c.sort((j,l)->Integer.compare(map.get(l),map.get(j)));
        for(int i=0;i<k;i++){
            a[i]=c.get(i);
        }
        return a;
    }
}