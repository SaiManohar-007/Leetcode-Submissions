class Solution {
    public int similarPairs(String[] words) {
        Map<String, Integer> m = new HashMap<>();
        int[] freq=new int[26];
        
        StringBuilder s = new StringBuilder();

        for(int i=0;i<words.length;i++){
            Arrays.fill(freq,0);
            s.setLength(0);
            String word= words[i];
            for(char c: word.toCharArray()){
                freq[c-'a']++;
            }
            for(int j=0;j<26;j++){
                if(freq[j]>0){
                    s.append(String.valueOf((char) j+'a'));
                }
            }
            String rep= String.valueOf(s);
            if(m.containsKey(rep)){
                m.put(rep,m.getOrDefault(rep,0)+1);
            }
            else{
                m.put(rep,1);
            }
        }
        int answer=0;
        for (Map.Entry<String, Integer> e : m.entrySet()) {
            int value=e.getValue();
            int pairs = (value*(value-1))/2;
            answer+=pairs;
            }
            return answer;
    }
}