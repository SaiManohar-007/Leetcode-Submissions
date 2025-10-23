class Solution {
    public String largestGoodInteger(String num) {
        int k=1;
        num+=" ";
        String ans=String.valueOf(num.charAt(0));
        int larglen=0;
        String finalans="";
        for(int i=1;i<num.length();i++){
            if(k==3){
                int len=0;
                len=Integer.valueOf(ans);
                //System.out.println(len);
                if(len>=larglen){
                    larglen=len;
                    finalans=ans;
                    k=1;
                    ans=String.valueOf(num.charAt(i));
                }
            }
            char curr=num.charAt(i);
            char prev=num.charAt(i-1);
            if(curr==prev){
                k++;
                ans+=curr;
                //System.out.println(ans);
            }
            else{
                k=1;
               // System.out.println(ans);
                ans="";
                ans=String.valueOf(num.charAt(i));
            }
        }
        return finalans;
    }
}