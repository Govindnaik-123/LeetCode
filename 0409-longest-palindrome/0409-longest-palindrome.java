class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
       boolean hasodd=false;
       for(int j:map.values()){
        count=count+(j/2)*2;
        if(j%2!=0){
            hasodd=true;
        }
       }
       if(hasodd){
        return count+1;
       }
        return count;
    }
}