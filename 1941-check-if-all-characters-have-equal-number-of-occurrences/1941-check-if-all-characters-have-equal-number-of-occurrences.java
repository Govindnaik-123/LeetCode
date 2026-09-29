class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(HashMap.Entry<Character,Integer>e:map.entrySet()){
             max=Math.max(max,e.getValue());
             min=Math.min(min,e.getValue());
        }
    return max==min;
    }
}