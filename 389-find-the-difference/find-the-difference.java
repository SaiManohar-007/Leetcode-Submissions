class Solution {
    public char findTheDifference(String s, String t) {
        int sumOfs1=0;
        int sumOfs2=0;

        for(int i=0;i<s.length();i++){
            sumOfs1+=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            sumOfs2+=t.charAt(i);
        }
        int answer=sumOfs2-sumOfs1;
        return (char)answer;
    }
}