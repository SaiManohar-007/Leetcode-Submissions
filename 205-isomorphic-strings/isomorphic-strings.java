class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] indexMapS= new int[256];
        int[] indexMapT= new int[256];

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(indexMapS[c1]!=indexMapT[c2]){
                return false;
            } 

            indexMapS[c1]=i+1;
            indexMapT[c2]=i+1;
        }
        return true;    
    }
}