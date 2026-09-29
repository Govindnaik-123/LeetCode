class Solution {
    public int maxFreqSum(String s) {
      HashMap<Character,Integer>map=new HashMap<>();
      for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
      }  
      int max1=0;
      int max2=0;
      for(HashMap.Entry<Character,Integer>e:map.entrySet()){
            if(e.getKey()=='a'|| e.getKey()=='e' || e.getKey()=='i' || e.getKey()=='o' || e.getKey()=='u'){
                max1=Math.max(max1,e.getValue());
            }
            else{
                max2=Math.max(max2,e.getValue());
            }
      }
      return max1+max2;
    }
}