class Solution {
    public int[] reversee(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reversee(nums,0,nums.length-1);
        reversee(nums,0,k-1);
        reversee(nums,k,nums.length-1);
        
        
    }
}