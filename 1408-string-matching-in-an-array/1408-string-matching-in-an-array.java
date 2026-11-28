class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String>s=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[i].contains(words[j])){
                    if(!s.contains(words[j]))
                    s.add(words[j]);
                }
            }
        }
        return s;
    }
}