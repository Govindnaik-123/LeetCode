class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>1){
                res[0]=e.getKey();
                break;
            }
        }
        for(int i=1;i<=grid.length*grid.length;i++){
            if(!map.containsKey(i)){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}