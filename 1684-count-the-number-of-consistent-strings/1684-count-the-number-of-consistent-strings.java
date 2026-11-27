class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>a=new HashSet<>();
        for(char i:allowed.toCharArray()){
            a.add(i);
        }
        int res=0;
        for(int i=0;i<words.length;i++){
            int count=0;
            for(int j=0;j<words[i].length();j++){
                if(a.contains(words[i].charAt(j))){
                    count=1;
                }else{
                    count=0;
                    break;
                }
                
            }
            if(count==1){
                    res=res+1;
                }
        }
        return res;
    }
}