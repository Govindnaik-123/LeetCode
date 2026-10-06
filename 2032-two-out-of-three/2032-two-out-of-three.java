class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        HashSet<Integer>set3=new HashSet<>();
        HashSet<Integer>set4=new HashSet<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        for(int i:nums3){
            set3.add(i);
        }

    for(int i:nums1){
        if(set2.contains(i) || set3.contains(i)){
            set4.add(i);
        }
    }
    for(int i:nums2){
        if(set3.contains(i)){
            set4.add(i);
        }
    }
    for(int i:set4){
        res.add(i);
    }
    return res;

    }
}