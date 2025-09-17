class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] e = new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                e[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                e[count]=nums[i];
                count++;
            }
        }
        int i=0;
        int j=nums.length/2;
        for(int k=0;k<nums.length;k++){
            if(k%2==0){
                nums[k]=e[i];
                i++;
            }
            else{
                nums[k]=e[j];
                j++;
            }
        }
        return nums;

    }
}