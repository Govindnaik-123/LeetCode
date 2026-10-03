class Solution {
    public int[] scoreValidator(String[] events) {
        int res[]=new int[2];
        int score=0;
        int counter=0;
        for(int i=0;i<events.length;i++){
            if(events[i].equals("1")){
                score=score+1;
            }
            if(events[i].equals("2")){
                score=score+2;
            }
            if(events[i].equals("3")){
                score=score+3;
            }
            if(events[i].equals("4")){
                score=score+4;
            }
            if(events[i].equals("6")){
                score=score+6;
            }
            if(events[i].equals("WD") || events[i].equals("NB")){
                score=score+1;
            }
            if(events[i].equals("W")){
                counter++;
            }
            if(counter==10){
                res[0]=score;
                res[1]=10;
                return res;
            }
        }
        res[0]=score;
        res[1]=counter;
        return res;
    }
}