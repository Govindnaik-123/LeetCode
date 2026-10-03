class Solution {
    public int countValidPrefixes(String s) {
      int cz=0;
      int count=0;
      int co=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0'){
            cz++;
        }
        if(s.charAt(i)=='1'){
            co++;
        }
        if(Math.abs(cz-co)<=1){
            count++;
        }
      } 
      return count; 
    }
}