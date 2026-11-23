class Solution {
    public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> tally = new HashMap<>();
    tally.put(0, 1); // empty start
    int prefix = 0, result = 0;
    for (int x : nums) {
        prefix += x; // 1. update prefix
        result += tally.getOrDefault(prefix - k, 0); // 2. look up
        tally.put(prefix, tally.getOrDefault(prefix, 0) + 1); // 3. add
    }
    return result;
}

}