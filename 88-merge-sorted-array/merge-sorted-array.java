class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[m+n];
        int i=0; int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                ans[k]=nums1[i];
                i++;
                k++;
            }
            else{
                ans[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            ans[k]=nums1[i];
            i++;k++;
        }
        while(j<n){
            ans[k]=nums2[j];
            k++;
            j++;
        }
        //System.out.println(Arrays.toString(ans));
        for(int q=0;q<ans.length;q++){
            nums1[q]=ans[q];
        }
    }
}