class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(char c:ransomNote.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:magazine.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for(HashMap.Entry<Character,Integer>e:map1.entrySet()){
            char key=e.getKey();
            int n=e.getValue();
            if(map2.getOrDefault(key,0)<n){
                return false;
            }
            }
       return true;
    }
}