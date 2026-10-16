class Solution {
    public long countBadPairs(int[] nums) {
        int[] tr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            tr[i]=nums[i]-i;
        }
        Map<Integer,Integer> m = new HashMap<>();
        for(int i: tr){
            if(m.containsKey(i)){
                m.put(i,m.getOrDefault(i,0)+1);
            }
            else{
                m.put(i,1);
            }
        }
        long goodPairs=0;

        for(Map.Entry<Integer,Integer> n: m.entrySet()){
            long num= n.getValue();
            long pairs= (num*(num-1))/2;
            goodPairs+=pairs;
        }
        long len=nums.length;
        long totalPairs=(len*(len-1))/2;
        return totalPairs-goodPairs;
    }
}