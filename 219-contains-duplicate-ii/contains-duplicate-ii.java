class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(m.containsKey(ele) && i-m.get(ele)<=k){
                return true;
            }
            m.put(ele,i);    
        }
        return false;
    }
}