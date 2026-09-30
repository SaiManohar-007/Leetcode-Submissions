class Solution {
    public boolean areOccurrencesEqual(String s) {
        if(s.length()==1){
            return true;
        }
        Map<Character,Integer> m= new HashMap<>();
        for(int i =0;i<s.length();i++){
            char c=s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
            //  System.out.println(arr[s.charAt(i) - 'a']);
        }
        int freq=m.get(s.charAt(0));
        // int f=arr[0];
        // for(int i = 0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        //     // if(arr[i]!=f){
        //     //     return false;
        //     // }
        // }

        // return true;
       for (Map.Entry<Character, Integer> entry : m.entrySet()) {
         if (entry.getValue() != freq) {
                return false; 
    }
}

        return true;

    }
}