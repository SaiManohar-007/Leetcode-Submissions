class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int k=0;
        int j=1;
        while(j<nums.length){
            if(nums[k]==0 && nums[j]!=0){
                int t=nums[k];
                nums[k]=nums[j];
                nums[j]=t;
                k++;j++;
            }
            else if(nums[k]==0 && nums[j]==0){
                j++;
            }
            else if(nums[k]!=0){
                k++;j++;
            }
        }
        return nums;
        
    }
}