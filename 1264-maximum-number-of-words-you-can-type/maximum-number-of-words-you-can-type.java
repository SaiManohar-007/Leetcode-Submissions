class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split("\\s+");
        int count=0;
        Set<Character> s = new HashSet<>();
        for(int j=0;j<brokenLetters.length();j++){
                char c=brokenLetters.charAt(j);
                s.add(c);
            }
        for(int i =0;i<words.length;i++){
            String w = words[i];
            for(int k=0;k<w.length();k++){
                char b = w.charAt(k);
                if(s.contains(b)){
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
}