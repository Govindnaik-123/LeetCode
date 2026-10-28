class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>s=new Stack<>();
        StringBuilder res=new StringBuilder();
        if(word.indexOf(ch) == -1){
            return word;
        }
        int i=0;
        while(word.charAt(i)!=ch){
                s.push(word.charAt(i));
                i++;
            }
            res.append(word.charAt(i));
            while(!s.isEmpty()){
                res.append(s.pop());
            }
            for(int j=i+1;j<word.length();j++){
                res.append(word.charAt(j));
            }
            return res.toString();
    }
}