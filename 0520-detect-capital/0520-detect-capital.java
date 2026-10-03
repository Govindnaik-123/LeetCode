class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                a++;

            
            if(a==n)
                return true;
            }
          if(Character.isLowerCase(word.charAt(i))){
                b++;
            
            if(b==n)
                return true;
            }
          if(i==0 && Character.isUpperCase(word.charAt(i))){
                c++;
                
            }
                if(c+b==n)
                    return true;
        }
        return false;

    }
}