class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> s = new HashSet<>();
        for(int i=0;i<paths.size();i++){
            String c=paths.get(i).get(0);
            s.add(c);
        }

        for(int i=0;i<paths.size();i++){
            String c=paths.get(i).get(1);
            if(!s.contains(c)){
                return c;
            }
            //s.add(c);
        }


       
        return "ho";
        
    }
}