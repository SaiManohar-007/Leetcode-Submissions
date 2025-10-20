class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(m.containsKey(ele)){
                int firstOccurence=m.get(ele);
                if(i-firstOccurence<=k){
                    return true;
                }
                else{
                    m.put(ele,i);
                }
            }
            else{
                m.put(ele,i);
            }
        }
        return false;
    }
}