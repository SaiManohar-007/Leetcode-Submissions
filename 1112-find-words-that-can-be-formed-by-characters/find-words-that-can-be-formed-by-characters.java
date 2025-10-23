class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charfreq= new int[26];
        int len=0;
        for( char c: chars.toCharArray()){
            charfreq[c-'a']++;
        }
       // System.out.println(Arrays.toString(charfreq));
       for(String word: words){
        int lengthh = word.length();
        if (lengthh > chars.length()) continue;
        int[] wordfreq= new int[26];
        for(char c: word.toCharArray()){
            wordfreq[c-'a']++;
        }
        boolean isValid=true;
        for(int i=0;i<26;i++){
            if(wordfreq[i]>charfreq[i]){
                isValid=false;
                break;
            }
        }
        if(isValid){
            len+=word.length();
        }
       }
       return len;
        
        
    }
}