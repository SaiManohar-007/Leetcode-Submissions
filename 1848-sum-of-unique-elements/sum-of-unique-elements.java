class Solution {
    public int sumOfUnique(int[] nums) {
       Map<Integer, Integer> m = new HashMap<>();
       int count=0;
       for(int i=0;i<nums.length;i++){
        m.put(nums[i], m.getOrDefault(nums[i],0)+1);
       }
       for(int i=0;i<nums.length;i++){
        int element=nums[i];
        if(m.get(element)==1){
            count+=nums[i];
        }
       }
       return count;


    }
}