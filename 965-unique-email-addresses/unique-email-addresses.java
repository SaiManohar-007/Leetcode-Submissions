class Solution {
    public int numUniqueEmails(String[] emails) {
        Map<String,Integer> m = new HashMap<>();
        for(int i=0;i<emails.length;i++){
            String mail=emails[i];
            String key=normalize(mail);
            if(!m.containsKey(key)){
                m.put(key,0);
            }
            m.put(key,m.get(key)+1);
        }
        return m.size();
    }

    public String normalize(String mail){
        Boolean localNamePassed=false;
        Boolean canSkip=false;
        StringBuilder s = new StringBuilder();
        for(char c:mail.toCharArray()){
            if(c=='@'){
                localNamePassed=true;
                canSkip=false;
            }
            if((c=='.' && localNamePassed==false) || canSkip==true){
                continue;
            }
            else{
                if(c=='+'){
                    if(localNamePassed){
                        s.append(c);
                    }
                    else{
                        canSkip=true;
                    }
                    
                }
                else{
                    s.append(c);
                }      
            }
        }
        return String.valueOf(s);
    }
}