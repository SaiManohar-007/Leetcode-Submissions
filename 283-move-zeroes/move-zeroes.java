class Solution {
    public void moveZeroes(int[] nums) {
        int read=0;
        int write=1;
        while(write<nums.length){
            if(nums[read]==0 && nums[write]!=0){
                nums[read]=nums[write];
                nums[write]=0;
                read++;
                write++;
            }
            else if(nums[read]==0 && nums[write]==0){
                write++;
            }
            else{
                write++;
                read++;
            }
        }
    }
}