class Solution {
   
    public int longestBeautifulSubstring(String word) {
        int len=1;
        int finallen=0;
        int uniquevowel=1;
        for(int i =1;i<word.length();i++){
            char prev = word.charAt(i-1);
            char curr= word.charAt(i);
            if(prev==curr){
                len++;
            }
            else if(curr>prev){
                len++;
                uniquevowel++;
            }
            else{
                len=1;
                uniquevowel=1;
            }
            if(uniquevowel==5){
                finallen=Math.max(len,finallen);
            }
        }
        return finallen;
    }
}