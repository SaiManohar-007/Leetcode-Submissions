class Solution {
    public int romanToInt(String s) {
     int res=0;
     Map<Character, Integer> m = new HashMap<>();
     m.put('I',1);
     m.put('V',5);
     m.put('X',10);
     m.put('L',50);
     m.put('C',100);
     m.put('D',500);
     m.put('M',1000);
     res+=m.get(s.charAt(s.length()-1));
     for(int i=s.length()-2;i>=0;i--){
           char c= s.charAt(i);
           char c2=s.charAt(i+1);
           if(m.get(c)<m.get(c2)){
                res=res-m.get(c);
           }
           else{
            res+=m.get(c);
           }
     } 
     return res;  
    }
}