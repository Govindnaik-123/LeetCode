class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
       int x=Math.max(x1,Math.min(xCenter,x2));
       int y=Math.max(y1,Math.min(yCenter,y2));
       int m=xCenter-x;
       int n=yCenter-y;
       int z=m*m+n*n;
       if(z<=radius*radius){
        return true;
       }
       else{
       return false;
       }
    }
}