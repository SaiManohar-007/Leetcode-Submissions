class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length==1) return 0;
        int maxlen=0;
        Map<Integer,Integer> m = new HashMap<>();
        int sum=0;
        m.put(0,0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum+=-1;
            }else{
                sum+=nums[i];
            }
            if(!m.containsKey(sum)){
                m.put(sum,i+1);
            }
            else{
                int len=i+1 - m.get(sum);
                maxlen=Math.max(maxlen,len);
            }

        }
        if(maxlen==1) return 0;
        return maxlen;
    }
}