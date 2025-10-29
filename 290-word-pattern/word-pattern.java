class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> pw = new HashMap<>();
        Map<String, Character> wp = new HashMap<>();
        String[] arr =  s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char patternchar=pattern.charAt(i);
            String word=arr[i];
            if(!pw.getOrDefault(patternchar,word).equals(word) || wp.getOrDefault(word,patternchar)!=patternchar){
                return false;
            }
            pw.put(patternchar,word);
            wp.put(word,patternchar);

            
        }
        return true;  
    }
}