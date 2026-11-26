class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length==1) return 0;
        int maxlen=0;
        Map<Integer,Integer> m = new HashMap<>();
        int sum=0;
        m.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(!m.containsKey(sum)){
                m.put(sum,i);
            }
            else{
                int len=i - m.get(sum);
                maxlen=Math.max(maxlen,len);
            }
        }
        return maxlen;
    }
}