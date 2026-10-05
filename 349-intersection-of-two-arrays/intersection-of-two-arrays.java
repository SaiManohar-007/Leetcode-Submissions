class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for(int num:nums1){
            s.add(num);
        }
        List<Integer> answer= new ArrayList<>();
        for(int num: nums2){
            if(s.contains(num)){
                if(!answer.contains(num)){
                    answer.add(num);
                }
                
            }
        }

        int[] result= new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            result[i]=answer.get(i);
        }

        return result;
    }
}