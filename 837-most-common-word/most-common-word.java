class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] paragraphArray=paragraph.split("[\\p{Punct}\\s]+");
        // System.out.println(paragraphArray[0]);
        // return "hi";
        int max=0;
        String answer="";
        Map<String, Integer> m= new HashMap<>();
        Set<String> s = new HashSet<>();
        for(String word: banned){
            s.add(word);
        }
        // System.out.println(s);
        for(int i=0;i<paragraphArray.length;i++){
            String word=paragraphArray[i].toLowerCase();
            if(!s.contains(word)){
                // System.out.println(word);
                // continue;
                
                m.put(word,m.getOrDefault(word,0)+1);
                if(max<m.get(word)){
                max=m.get(word);
                answer=word;
                System.out.println(word);
                 }
            }

//             System.out.println(
//     "word=" + word +
//     " freq=" + m.get(word) +
//     " max=" + max +
//     " answer=" + answer
// );
            
            
        }

        return answer;
    }
}