class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder st=new StringBuilder();
            int n=s.length();
            for(int i=0;i<n;i=i+k){
                int ans=0;
                for(int j=i;j<Math.min(i+k,n);j++){
                    ans=ans+s.charAt(j)-'0';
                }
                st.append(ans);
            }
            s=st.toString();
        }
        return s;
    }
}