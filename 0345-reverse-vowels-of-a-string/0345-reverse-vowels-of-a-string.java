class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character>a=new ArrayList<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || 
               s.charAt(i)=='e' || 
               s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
               s.charAt(i)=='A' || 
               s.charAt(i)=='E' || 
               s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                a.add(s.charAt(i));
               }
        }
        int j=a.size()-1;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || 
               s.charAt(i)=='e' || 
               s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
               s.charAt(i)=='A' || 
               s.charAt(i)=='E' || 
               s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
               
                    res.append(a.get(j));
                    j--;
                
               }else{
                res.append(s.charAt(i));
               }
        }
        return res.toString();
        
    }
}