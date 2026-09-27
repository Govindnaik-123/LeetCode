class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=Math.abs(nums[i])-1;
            if(nums[j]<0){
                a.add(Math.abs(nums[i]));
            }
            nums[j]=-nums[j];
        
        }
    return a;
    }
}