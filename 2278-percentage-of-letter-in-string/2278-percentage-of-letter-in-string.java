class Solution {
    public int percentageLetter(String s, char letter) {
        int n=s.length();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==letter){
                count++;
            }
        }
        double per=((double)count/n)*100;
        int res=Math.round((int)per);
        return res;
    }
}