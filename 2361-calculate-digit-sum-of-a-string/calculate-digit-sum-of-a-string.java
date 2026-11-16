class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb= new StringBuilder(s);
        StringBuilder ans=stringmaker(sb,k);
        return String.valueOf(ans);
    }

    public StringBuilder stringmaker(StringBuilder sb,int k){
        if(sb.length()<=k){
            return sb;
        }
        StringBuilder news= new StringBuilder();
        int val=0;
        int counter=0;
        for(int i=0;i<sb.length();i++){
            if(counter==k){
                news.append(val);
                val=0;
                counter=0;
            }
            val+=sb.charAt(i)-'0';
            counter++;
        }
        news.append(val);
        return stringmaker(news,k);
    }
}