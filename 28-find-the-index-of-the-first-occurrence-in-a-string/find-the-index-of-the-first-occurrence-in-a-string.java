class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        // int firstindex=0;
        // int j=0;
        // for(int i=0;i<haystack.length();i++){
        //     char hchar=haystack.charAt(i);
        //     char nchar=needle.charAt(j);
        //     if(hchar==nchar){
        //         j++;
        //     }
        //     else{
        //         j=0;
        //     }
        //     if(j>needle.length()-1){
        //         firstindex=i-j+1;
        //         System.out.println(i + " "+ j);
        //         j=0;
        //         break;
        //     }
        // }
        // return firstindex;
        int nl=needle.length();
        for(int i=0;i<=haystack.length()-nl;i++){
            String s = haystack.substring(i,i+nl);
            if(s.equals(needle)){
                return i;
            }
        }
        return 0;
    }
}