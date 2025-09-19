class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            m.put(ele, m.getOrDefault(ele,0)+1);
        }
        int av=nums.length/2;
        int ans=0;
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue()>av){
                ans=e.getKey();
            }
        }
        return ans;
    }
}