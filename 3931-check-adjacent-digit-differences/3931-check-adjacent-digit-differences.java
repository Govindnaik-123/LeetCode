class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            int j=i+1;
            if(Math.abs(s.charAt(i)-s.charAt(j))>2){
                return false;
            }
        }
        return true;
    }
}