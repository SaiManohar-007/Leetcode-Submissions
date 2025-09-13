class Solution {
    public int lengthOfLastWord(String s) {
        int charCount=0;
        String f=s.trim();
        for(int i=f.length()-1;i>=0;i--){
            char c=f.charAt(i);
            if(c==' '){
                break;
            }
            else{
                charCount++;
            }
        }
        return charCount;
    }
}