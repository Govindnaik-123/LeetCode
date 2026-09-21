class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        while(n>0){
            int r=n%10;
            map.put(r,map.getOrDefault(r,1)+1);
            n=n/10;
        }
        int min=Integer.MAX_VALUE;
        int min1=Integer.MAX_VALUE;
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            min=Math.min(min,e.getValue());
        }
       int j=0;
       for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
        if(min==e.getValue()){
            j++;
        }
       }
       int a[]=new int[j];
       int k=0;
       for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
        if(min==e.getValue()){
            a[k]=e.getKey();
            k++;
        }
       }

       for(int i:a){
        min1=Math.min(min1,i);
       }
       return min1;
    }
}