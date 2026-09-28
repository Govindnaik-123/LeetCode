class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(HashMap.Entry<Character,Integer>e:map.entrySet()){
            if(e.getValue()%2!=0){
            max=Math.max(max,e.getValue());
            }
            if(e.getValue()%2==0){
            min=Math.min(min,e.getValue());
            }
        }
        return max-min;
    }
}