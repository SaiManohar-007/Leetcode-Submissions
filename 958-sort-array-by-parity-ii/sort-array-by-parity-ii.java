class Solution {
    public int[] sortArrayByParityII(int[] nums) {
    /*one approach is to use the one we used for seperating pos neg nums in such a way that they appear in pairs staring with pos num. 
    the other approach is to take a sepreate array that has even nums first followed by odd nums. and then we enter elements into res array based on index parity if index is even we give it pos else odd.
    BOTH OF THESE REQUIRE AN EXTRA ARRAY O(n)
     */    

    int[] result= new int[nums.length];
    int i=0,j=1;
    for(int k=0;k<nums.length;k++){
        if(nums[k]%2==0){
            result[i]=nums[k];
            i+=2;
        }
        else{
            result[j]=nums[k];
            j+=2;
        }
     }
     return result;
    }
}