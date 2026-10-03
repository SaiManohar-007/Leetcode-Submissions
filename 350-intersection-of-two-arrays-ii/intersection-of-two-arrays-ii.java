class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] common = new int[1001];
        int[] curr = new int[1001];
        for(int num: nums1){
            common[num]++;
        }

        for(int num: nums2){
            curr[num]++;
        }

       for(int count=0;count<common.length;count++){
        common[count]=Math.min(common[count],curr[count]);
       }

       List<Integer> ans= new ArrayList<>();
       for(int i=0;i<common.length;i++){
        int count= common[i];
        for(int c=0;c<count;c++){
            ans.add(i);
        }
       }

       int[] answer= new int[ans.size()];
       for(int i=0;i<ans.size();i++){
        answer[i]=ans.get(i);
       }

        return answer;
        
    }
}