class Solution {
    public boolean checkString(String s) {
       int n=s.length();
       int count1=0;
       int count2=0;
       for(char c:s.toCharArray()){
        if(c=='b'){
        count1++;
        }else{
            count2++;
        }
       }
       if(count1==n || count2==n){
        return true;
       }
       for(int i=0;i<n-1;i++){
        if(s.charAt(i)=='a'){
            if(i>0){
           if(s.charAt(i-1)=='b'){
            return false;
           }
            }
        }else if(s.charAt(i)=='b'){
            if(s.charAt(i+1)!='b'){
                return false;
            }
        }
       }
       return true;
    }
}