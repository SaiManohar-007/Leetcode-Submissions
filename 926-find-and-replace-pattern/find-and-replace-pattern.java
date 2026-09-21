class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        Map<Character,Integer> patternfinder= new HashMap<>();
        int nextNumber=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            if(patternfinder.containsKey(c)){
                sb.append(patternfinder.get(c)).append(' ');
            }
            else{
                nextNumber++;
                patternfinder.put(c,nextNumber);
                sb.append(nextNumber).append(' ');   
            }
        }
        nextNumber=0;
        patternfinder.clear();
        List<String> answer = new ArrayList<>();
        StringBuilder p = new StringBuilder();
        for(int j=0;j<words.length;j++){
            String word=words[j];
            for(int i=0;i<word.length();i++){
                char c=word.charAt(i);
                if(patternfinder.containsKey(c)){
                    p.append(patternfinder.get(c)).append(' ');
                }
                else{
                    nextNumber++;
                    patternfinder.put(c,nextNumber);
                    p.append(nextNumber).append(' ');
                }
            }
            nextNumber=0;
          
            if(sb.toString().equals(p.toString())){
                System.out.println(sb + "\t is pattern code");
                System.out.println(p + "\t is matched pattern code");
                System.out.println(words[j] + "\t is matched word");

                answer.add(words[j]);
                p.setLength(0);
                patternfinder.clear();
            }
            else{
                p.setLength(0);
                patternfinder.clear();
            }

        }
        
        System.out.println(sb);
        return answer;
        
    }
}