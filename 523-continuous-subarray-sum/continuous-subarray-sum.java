class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // boolean result=false;
        int sum=0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int remainder=sum%k;
            if(m.containsKey(remainder)){
                int idx=m.get(remainder);
                int len=i-idx;
                if(len>1){
                    return true;
                }
            }
            else{
                m.put(remainder,i);
            }
        }
        return false;
    }
}