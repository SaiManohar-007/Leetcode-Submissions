class Solution {
    public boolean canConstruct(String r, String m) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<r.length();i++){
            char c = r.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(int i=0;i<m.length();i++){
            char c=m.charAt(i);
            if(map.containsKey(c)) {
                if(map.get(c)>0){
                    map.put(c,map.get(c)-1);
                }
            }
            
        }

        // for(int i=0;i<m.length();i++){
        //     char c=m.charAt(i);
        //     if(map.containsKey(c)){
        //         if(map.get(c)!=0) return false;
        //     }
        // }

        for (Integer value : map.values()) {
            if (value != 0) {
                return false; 
            }
        }
        return true;
    }
}