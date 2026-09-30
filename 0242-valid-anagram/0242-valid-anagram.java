class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer>map1=new HashMap<>();
       HashMap<Character,Integer>map2=new HashMap<>();
       if(s.length()!=t.length()){
        return false;
       }
       for(char c:s.toCharArray()){
        map1.put(c,map1.getOrDefault(c,0)+1);
       }
       for(char c:t.toCharArray()){
        map2.put(c,map2.getOrDefault(c,0)+1);
       }
       for(HashMap.Entry<Character,Integer>e:map1.entrySet()){
        char b=e.getKey();
        int n=e.getValue();
        if(map2.getOrDefault(b,0)!=n){
            return false;
        }
       }
       return true;
    }
}