class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String>map=new HashMap<>();
        String n[]=new String[names.length];
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
           n[i]=map.get(heights[heights.length-1-i]);
            }

       return n;
    }
}