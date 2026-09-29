class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map=new HashMap<>();
        int kc=0;
        for(char c:text.toCharArray()){
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n'){
            map.put(c,map.getOrDefault(c,0)+1);
            
            }
        }
        int min=Integer.MAX_VALUE;
        for(HashMap.Entry<Character,Integer>e:map.entrySet()){
            kc++;
            int count=e.getValue();
            if(e.getKey()=='l'||e.getKey()=='o'){
                count=count/2;
            }
            min=Math.min(min,count);
        }
        if(kc!=5){
            return 0;
        }
        return min;
    }
}