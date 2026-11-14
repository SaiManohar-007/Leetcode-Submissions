class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        int closest=Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum=nums[j]+nums[k]+nums[i];
                int currclosediff=Math.abs(target-sum);
                if(currclosediff<closest){
                    ans=sum;
                }
                closest=Math.min(currclosediff,closest);
                if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
}