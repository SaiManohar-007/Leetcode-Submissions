class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==2){
            return ((nums[0]-1)*(nums[1]-1));
        }
        int l=-1;
        int lind=0;
        int s=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>l){
                l=nums[i];
                lind=i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>s && i!=lind){
                s=nums[i];
            }
        }
        int n=(l-1)*(s-1);
        return n;

    }
}