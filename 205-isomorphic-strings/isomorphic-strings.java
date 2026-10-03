class Solution {
    public boolean isIsomorphic(String s, String t) {
        // int[] freq=new int[26];
        StringBuilder Snormalized= new StringBuilder();
        // for(char c: s.toCharArray()){
        //     freq[c-'a']++;
        // }
        // for(int i = 0;i<26;i++){
        //     int count=freq[i];
        //     for(int j=0;j<count;j++){
        //         Snormalized.append(count).append(' ');
        //     }
        // }
        // Arrays.fill(freq,0);

        // for(char c: t.toCharArray()){
        //     freq[c-'a']++;
        // }
        StringBuilder Tnormalized= new StringBuilder();

        // for(int i = 0;i<26;i++){
        //     int count=freq[i];
        //     for(int j=0;j<count;j++){
        //         Tnormalized.append(count).append(' ');
        //     }
        // }
        Map<Character,Integer> m = new HashMap<>();
        int nextId=0;
        for(char c: s.toCharArray()){
            if(m.containsKey(c)){
                Snormalized.append(m.get(c)).append(' ');
            }
            else{
                m.put(c,nextId);
                nextId++;
                Snormalized.append(m.get(c)).append(' ');
            }
        }
        m.clear();
        nextId=0;
        for(char c:t.toCharArray()){
            if(m.containsKey(c)){
                Tnormalized.append(m.get(c)).append(' ');
            }
            else{
                m.put(c,nextId);
                nextId++;
                Tnormalized.append(m.get(c)).append(' ');
            }
        }
        return Snormalized.toString().equals(Tnormalized.toString());
    }
}