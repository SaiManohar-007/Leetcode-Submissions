class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer= new ArrayList<>();
        Map<String, List<String>> groups = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String SortedString=sorted(strs[i]);
            if(groups.containsKey(SortedString)){
                groups.get(SortedString).add(strs[i]);
            }
            else{
                groups.put(SortedString,new ArrayList<>());
                groups.get(SortedString).add(strs[i]);
                
            }
        }

        for (Map.Entry<String, List<String>> entry : groups.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            answer.add(value);
        }

        return answer;


    }

    public String sorted(String s){
        char[] charArray=s.toCharArray();
        Arrays.sort(charArray);
        String sortedS= new String(charArray);
        return sortedS;
    }
}