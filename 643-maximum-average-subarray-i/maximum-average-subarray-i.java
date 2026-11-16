class Solution {
    static {
        for (int i = 0; i < 500; i++) 
            findMaxAverage(new int[] {0}, 0);
    }
    public static double findMaxAverage(int[] nums, int k) {
        double windsum=0;
        double avg=Integer.MIN_VALUE;

        for(int i =0;i<k;i++){
            windsum += nums[i];
        }
        avg=Math.max(avg,windsum/k);

        for(int j=k;j<nums.length;j++){
            windsum+=nums[j]-nums[j-k];
            avg=Math.max(avg,windsum/k);
        }
        return avg;
    }
}