class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
       for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),i);
       }
       for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i),i);
       }
       int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            sum=sum+Math.abs(map1.get(c)-map2.get(c));
        }
        return sum;
    }
}