class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>s=new Stack<>();
        for(String i:operations){
            if(i.equals("C")){
                s.pop();
            }
            else if(i.equals("D")){
                s.push(2*s.peek());
            }
            else if(i.equals("+")){
                int top=s.pop();
                int a=s.peek();
                int b=top+a;
                s.push(top);
                s.push(b);

            }
            else {
                int c=Integer.parseInt(i);
                s.push(c);
            }
        }
        int sum=0;
        for(int i:s){
            sum=sum+i;
        }
        return sum;
    }
}