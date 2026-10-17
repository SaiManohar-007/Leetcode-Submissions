class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> m = new HashMap<>();

        for(int i=0;i<groupSizes.length;i++){
            int num= groupSizes[i];
            if(!m.containsKey(num)){
                m.put(num, new ArrayList<>());
            }
            m.get(num).add(i);
        }
        List<List<Integer>> answer= new ArrayList<>();
        for(Map.Entry<Integer,List<Integer>> e: m.entrySet()){
            int size=e.getKey();
            int len=e.getValue().size();
            int totalgroups= len/size;
            int tg=totalgroups;
            List<Integer> l = e.getValue();
            
            while(tg>0){
                int iteration=totalgroups-tg;
                List<Integer> r= new ArrayList<>();
                for(int i=0;i<size;i++){
                    r.add(l.get(i+size*iteration));
                }
                tg--;
                answer.add(r);
            } 
        }

        return answer;
        
    }
}