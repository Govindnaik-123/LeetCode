class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer>res=new ArrayList<>();
        int i=0;
        int j=0;
        int k=0;
        while(i<m){
            res.add(nums1[i]);
            i++;
        }
        while(j<n){
            res.add(nums2[j]);
            j++;
        }
        for(int l:res){
            nums1[k++]=l;
        }
        Arrays.sort(nums1);
    }
}