class Solution {
    public int maxPower(String s) {
       int max=1;
       int count=1;
       int i=0;
       while(i<s.length()-1){
        int j=i+1;
        char a=s.charAt(i);
        char b=s.charAt(j);
        if(a==b){
            count++;
            max=Math.max(max,count);
            i++;
        }else{
            max=Math.max(max,count);
            count=1;
            i=j;
        }
       } 
       return max;
    }
}