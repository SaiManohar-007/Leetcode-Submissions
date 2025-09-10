class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]==val && nums[j]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++; j--;
            }
            else if(nums[i]==val && nums[j]==val){
                j--;
            }
            else{
                i++;
            }
        }
        return i;
    }
}