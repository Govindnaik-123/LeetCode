class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long>s=new Stack<>();
        for(int i:nums){
            long j=i;
            while(!s.isEmpty() && s.peek()==j){
                s.pop();
                j=j*2;
            }
            s.push(j);
        }
         return new ArrayList<Long>(s);
    }
}