class Solution {
    public String largestGoodInteger(String num) {
        String[] answers={"000","111","222","333","444","555","666","777","888","999"};
        for(int i=answers.length-1;i>=0;i--){
            if(num.contains(answers[i])){
                return answers[i];
            }
        }
        return "";
    }
}