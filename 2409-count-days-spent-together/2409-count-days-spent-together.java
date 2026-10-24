class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
int Aama = Integer.parseInt(String.valueOf(arriveAlice.charAt(0))) * 10;
int Aamb = Integer.parseInt(String.valueOf(arriveAlice.charAt(1)));
int Aamc = Aama + Aamb;
int Aada = Integer.parseInt(String.valueOf(arriveAlice.charAt(3))) * 10;
int Aadb = Integer.parseInt(String.valueOf(arriveAlice.charAt(4)));
int Aadc = Aada + Aadb;

int Alma = Integer.parseInt(String.valueOf(leaveAlice.charAt(0))) * 10;
int Almb = Integer.parseInt(String.valueOf(leaveAlice.charAt(1)));
int Almc = Alma + Almb;
int Alda = Integer.parseInt(String.valueOf(leaveAlice.charAt(3))) * 10;
int Aldb = Integer.parseInt(String.valueOf(leaveAlice.charAt(4)));
int Aldc = Alda + Aldb;

int Bama = Integer.parseInt(String.valueOf(arriveBob.charAt(0))) * 10;
int Bamb = Integer.parseInt(String.valueOf(arriveBob.charAt(1)));
int Bamc = Bama + Bamb;
int Bada = Integer.parseInt(String.valueOf(arriveBob.charAt(3))) * 10;
int Badb = Integer.parseInt(String.valueOf(arriveBob.charAt(4)));
int Badc = Bada + Badb;

int Blma = Integer.parseInt(String.valueOf(leaveBob.charAt(0))) * 10;
int Blmb = Integer.parseInt(String.valueOf(leaveBob.charAt(1)));
int Blmc = Blma + Blmb;
int Blda = Integer.parseInt(String.valueOf(leaveBob.charAt(3))) * 10;
int Bldb = Integer.parseInt(String.valueOf(leaveBob.charAt(4)));
int Bldc = Blda + Bldb;

int months[]={ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

int aliceArrive=Aadc;
for(int i=0;i<Aamc-1;i++){
    aliceArrive=aliceArrive+months[i];
}
int aliceLeave=Aldc;
for(int i=0;i<Almc-1;i++){
    aliceLeave=aliceLeave+months[i];
}
int bobArrive=Badc;
for(int i=0;i<Bamc-1;i++){
    bobArrive=bobArrive+months[i];
}
int bobLeave=Bldc;
for(int i=0;i<Blmc-1;i++){
    bobLeave=bobLeave+months[i];
}
int start=Math.max(aliceArrive,bobArrive);
int end=Math.min(aliceLeave,bobLeave);

return Math.max(0,end-start+1);

    }
}