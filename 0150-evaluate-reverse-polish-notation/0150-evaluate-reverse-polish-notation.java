class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String token = tokens[i];
            if(token.equals("+")||
              token.equals("-") || 
              token.equals("*") || 
              token.equals("/")   ) {
                int a=s.pop();
                int b=s.pop();
                    if(token.equals("+")){
                        int res=a+b;
                        s.push(res);
                    }if(token.equals("-")){
                        int res=b-a;
                        s.push(res);
                    } 
                    if(token.equals("*")){
                        int res=a*b;
                        s.push(res);
                    }
                    if(token.equals("/")){
                        int res=b/a;
                        s.push(res);
                    }
            }
            else{
                int x=Integer.parseInt(token);
                s.push(x);
            }
        }
        return s.pop();
    }
}