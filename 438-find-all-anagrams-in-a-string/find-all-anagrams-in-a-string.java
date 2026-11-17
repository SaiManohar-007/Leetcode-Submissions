class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer= new ArrayList<>();
        if(p.length()>s.length()){
            return answer;
        }
        char[] arr=p.toCharArray();
        Arrays.sort(arr);
        String sortedP=new String(arr);
        int windowsize=p.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<windowsize;i++){
             sb.append(s.charAt(i));
        }
        if(checkAnagram(sb,sortedP)){
            answer.add(0);
        }

        for(int j=windowsize;j<s.length();j++){
            sb.append(s.charAt(j));
            // System.out.println(j-windowsize);
//             System.out.println(
//     "j = " + j +
//     ", windowSize = " + windowsize +
//     ", sb = " + sb +
//     ", deleteIndex = " + (j-windowsize) +
//     ", sbLength = " + sb.length()
// );
            sb.deleteCharAt(0);
            if(checkAnagram(sb,sortedP)){
            answer.add(j-windowsize+1);
            }
        }

        return answer;
    }

    public boolean checkAnagram(StringBuilder sb, String sortedP){
        char[] c=sb.toString().toCharArray();
        Arrays.sort(c);
        String s = new String(c);
        return s.equals(sortedP);
    }
}