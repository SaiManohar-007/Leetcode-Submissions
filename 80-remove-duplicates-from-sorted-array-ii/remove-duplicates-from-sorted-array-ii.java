class Solution {
    public int removeDuplicates(int[] nums) {
        int i=2;
        // int extra=0;
        // for(int j=1;j<nums.length;j++){
        //     if(nums[j]==nums[i]){
        //         extra++;
        //         if(extra>1){

        //         }
        //         else{
        //             i++;
        //         }
        //     }
        //     else{
        //         nums[i+1]=nums[j];
        //         i++;
        //         extra=0;
        //     }
        // }
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}