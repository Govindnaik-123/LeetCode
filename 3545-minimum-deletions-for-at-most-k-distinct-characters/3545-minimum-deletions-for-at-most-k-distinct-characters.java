class Solution {
    public int minDeletion(String s, int k) {
        HashSet<Character>set=new HashSet<>();
        HashMap<Character,Integer>map=new HashMap<>();
    
        for(char c:s.toCharArray()){
            set.add(c);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int a[]=new int[set.size()];
        int i=0;
        for(HashMap.Entry<Character,Integer>e:map.entrySet()){
            a[i]=e.getValue();
            i++;
        }
        Arrays.sort(a);
        int d=set.size()-k;
        if(d<0){
            return 0;
        }
        int sum=0;
        for(int j=0;j<d;j++){
            sum=sum+a[j];
        }
        return sum;
    }
}