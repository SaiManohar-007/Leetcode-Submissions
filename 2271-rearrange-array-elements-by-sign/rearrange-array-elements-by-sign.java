class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result=new int[nums.length];
        int i=0;
        int j=1;
        for(int k=0;k<nums.length;k++){
            if(nums[k]>=0){
                result[i]=nums[k];
                i=i+2;
            }
            else{
                result[j]=nums[k];
                j+=2;
            }
        }
        return result;
    }
}