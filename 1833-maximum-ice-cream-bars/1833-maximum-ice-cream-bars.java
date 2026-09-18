class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int sum=coins;
        for(int i:costs){
            if(sum>=i){
                count++;
                sum=sum-i;
            }else{
                break;
            }
        }
        return count;
    }
}