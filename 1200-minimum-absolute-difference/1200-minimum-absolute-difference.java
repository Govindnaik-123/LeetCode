class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        ArrayList<List<Integer>>res=new ArrayList<>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++ ){
            int j=i+1;
            int min2=Math.abs(arr[i]-arr[j]);
             min=Math.min(min2,min);
        }
        
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            int min1=Math.abs(arr[i]-arr[j]);
            if(min==min1){
                res.add(Arrays.asList(arr[i],arr[j]));
            }
        }
        return res;
    }
}