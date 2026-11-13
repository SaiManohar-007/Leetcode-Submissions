class Solution {
    public void moveZeroes(int[] nums) {
        int read=0;
        for(int write=1;write<nums.length;write++){
            if(nums[read]==0 && nums[write]!=0){
                nums[read]=nums[write];
                nums[write]=0;
                read++;
            }
            else if(nums[read]!=0){
                read++;
            }
        }
    }
}