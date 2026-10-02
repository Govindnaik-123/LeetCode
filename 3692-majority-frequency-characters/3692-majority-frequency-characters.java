class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Integer,Integer>map1=new HashMap<>();
       StringBuilder res=new StringBuilder();
        
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int a[]=new int[map.size()];
        int j=0;
        for(HashMap.Entry<Character,Integer>e:map.entrySet()){
            a[j]=e.getValue();
            j++;
        }
        for(int k:a){
            map1.put(k,map1.getOrDefault(k,0)+1);
        }
        int max=0;
        int key=0;
        int max1=0;
        for(HashMap.Entry<Integer,Integer>e1:map1.entrySet()){
           
            if(max<=e1.getValue()){
                max=e1.getValue();
                key=e1.getKey();
                max1=Math.max(key,max1);
                
            }
        }
        int l=0;
        for(HashMap.Entry<Character,Integer>e:map.entrySet()){
            if(max1==e.getValue()){
                res.append(e.getKey());
            }
        }
        return res.toString();

    }
}