class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[m+n];
        int i=0,j=0;
        while(i<m&&j<n){
            if(nums1[i]>nums2[j]) {
                res[i+j]=nums2[j];
                j++;
            }
            else {
                res[i+j]=nums1[i];
                i++;
            }
        }
        while(i<m){
            res[i+j]=nums1[i];
                i++;
        }
        while(j<n){
            res[i+j]=nums2[j];
            j++;
        }
        for(i=0;i<m+n;i++){
            nums1[i]=res[i];
        }
        return;
    }
}
