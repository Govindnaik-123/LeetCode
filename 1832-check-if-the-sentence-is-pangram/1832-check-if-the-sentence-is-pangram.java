class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        String s="abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Boolean>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,false);
        }
        for(char c:sentence.toCharArray()){
            map.put(c,true);
        }
        for(HashMap.Entry<Character,Boolean>e:map.entrySet()){
            if(e.getValue()==false){
                return false;
            }
        }
        return true;
    }
}