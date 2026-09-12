class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>arr=new ArrayList<>();

        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            arr.add(i);
        }
        int l=Math.min(k,arr.size());
        arr.sort(Comparator.reverseOrder());
        int a[]=new int[l];
        for(int i=0;i<l;i++){
            a[i]=arr.get(i);
        }
        return a;
    }
}