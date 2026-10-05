class Solution {
    public List<String> commonChars(String[] words) {
        int[] com= new int[26];
        int[] curr= new int[26];
        List<String> answer= new ArrayList<>();

        for(char c: words[0].toCharArray()){
            com[c-'a']++;
        }

        for(int i =0;i<words.length;i++){
            Arrays.fill(curr,0);

            String word=words[i];

            for(char c: words[i].toCharArray()){
                curr[c-'a']++;
            }

            for(int letter=0;letter<26;letter++){
                com[letter]=Math.min(com[letter],curr[letter]);
            }
        }
        for(int i=0;i<26;i++){
            int count=com[i];
            for(int j=0;j<count;j++){
                answer.add(String.valueOf((char) (i+'a')));
            }
        }
        return answer;
    }
}