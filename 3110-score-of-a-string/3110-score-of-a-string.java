class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int j=i+1;
            sum=sum+Math.abs(s.charAt(i)-s.charAt(j));
        }
        return sum;
    }
}