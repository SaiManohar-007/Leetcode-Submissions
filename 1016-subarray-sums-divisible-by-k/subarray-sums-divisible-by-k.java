class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        int sum=0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem = ((sum % k) + k) % k;;
            count+=m.getOrDefault(rem,0);
            m.put(rem,m.getOrDefault(rem,0)+1);
        }
        return count;
        
    }
}