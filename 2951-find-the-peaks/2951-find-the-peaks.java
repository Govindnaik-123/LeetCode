class Solution {
    public List<Integer> findPeaks(int[] mountain) {
       ArrayList<Integer>res=new ArrayList<>();
       for(int i=1;i<mountain.length-1;i++){
        int b=mountain[i-1];
        int a=mountain[i+1];
        if(mountain[i]>b && mountain[i]>a){
            res.add(i);
        }
       }
       return res;
    }
}