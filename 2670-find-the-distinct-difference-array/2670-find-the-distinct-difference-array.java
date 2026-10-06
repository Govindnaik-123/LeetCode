class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        
        int res[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int j=0;j<=i;j++){
            set1.add(nums[j]);
        }
       int m=set1.size();
       if(i==nums.length-1){
       int  n=0;
       }
        for(int k=i+1;k<nums.length;k++){
            set2.add(nums[k]);
        }
      int  n=set2.size();
        res[i]=m-n;
       } 
       return res;
    }
}