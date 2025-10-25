class Solution {
    public String largestOddNumber(String num) {
        char last=num.charAt(num.length()-1);
        int n=last-'0';
        System.out.println(n);
        if(n%2!=0){
            return num;
        }
        StringBuilder s = new StringBuilder(num);
        
        int conEven=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            int r=c-'0';
            if(r%2==0){
                conEven++;
            }
            else{
                break;
            }
        }

        s.delete(s.length()-conEven,s.length());
        System.out.println(s+"ji");
        return String.valueOf(s);    
    }
}