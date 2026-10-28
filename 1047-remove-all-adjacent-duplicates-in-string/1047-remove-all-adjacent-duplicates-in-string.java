class Solution {
    public String removeDuplicates(String s) {
       Stack<Character>st=new Stack<>();
       for(char i:s.toCharArray()){
        if(st.isEmpty()){
            st.push(i);
        }else{
            char top=st.peek();
        if(top==i){
            st.pop();
        }else{
            st.push(i);
        }
        }
       }
       StringBuilder res=new StringBuilder();
       for(char j:st){
        res.append(j);
       }
       return res.toString(); 
    }
}