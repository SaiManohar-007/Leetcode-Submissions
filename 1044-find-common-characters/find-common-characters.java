class Solution {
    public List<String> commonChars(String[] words) {
        int[] commonCharacterCount = new int[26];
        int[] currentCharacterCount = new int[26];
        List<String> answer= new ArrayList<>();

        for(char c:words[0].toCharArray()){
            commonCharacterCount[c-'a']++;
        }

        for(int i=1;i<words.length;i++){
            Arrays.fill(currentCharacterCount,0);

            for(char c: words[i].toCharArray()){
                currentCharacterCount[c-'a']++;
            }

            for(int letter=0;letter<26;letter++){
                commonCharacterCount[letter]=Math.min(commonCharacterCount[letter],currentCharacterCount[letter]);
            }

        }

        for(int letter=0;letter<26;letter++){
            int count=commonCharacterCount[letter];
            for(int i=0;i<count;i++){
                answer.add(String.valueOf((char) (letter + 'a')));
            }
        }
       
        return answer;
    }
}