class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int j=0;j<=s.length()-3;j++){
            char a=s.charAt(j);
            char b=s.charAt(j+1);
            char c=s.charAt(j+2);
            if(a!=b && b!=c && c!=a){
                count++;
            }
        }
        return count;
    }
}