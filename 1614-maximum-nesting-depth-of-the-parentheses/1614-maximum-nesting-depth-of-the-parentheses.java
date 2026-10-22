class Solution {
    public int maxDepth(String s) {
        int max=0;
        Stack<Character>st=new Stack<>();
        int count=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                count++;
                st.push(i);
            }
            if(i==')'){
                max=Math.max(max,count);
                count=count-1;
                st.pop();
            }
        }
        return max;
    }
}