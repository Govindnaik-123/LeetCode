class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=-1;
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            if(max<e.getValue()){
                max=e.getValue();
                a.clear();
             
                a.add(e.getKey());
            }else if(max==e.getValue()){
                a.add(e.getKey());
            }

        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){
                int target=nums[i];
                int c=0;
                for(int j=i;j<nums.length;j++){
                    if(nums[j]==target){
                        c++;
                    }
                    if(c==max){
                        min=Math.min(min,j-i+1);
                        break;
                    }
                }
            }
        }
        return min;
    }
}