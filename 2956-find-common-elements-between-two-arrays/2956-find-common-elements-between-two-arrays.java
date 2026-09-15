class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        int a[]=new int[2];
        for(int i:nums2){
            set1.add(i);
        }
        for(int j:nums1){
            set2.add(j);
        }
        int c1=0;
        int c2=0;
        for(int i:nums1){
            if(set1.contains(i)){
                c1=c1+1;
            }
        }
        for(int i:nums2){
            if(set2.contains(i)){
                c2=c2+1;
            }
        }
        a[0]=c1;
        a[1]=c2;
        return a;
    }
}