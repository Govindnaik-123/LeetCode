class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int res[]=new int[2];
       int sum=0;
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            sum=sum+grid[i][j];
        }
       }
       int n=grid.length*grid.length;
       int total=n*(n+1)/2;

       for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>1){
                res[0]=e.getKey();
                sum=sum-e.getKey();
            }
       }
       res[1]=total-sum;
       return res;
    }
}