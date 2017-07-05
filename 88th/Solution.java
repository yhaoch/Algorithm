public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] res = new int [m+n];
        //m = nums1.length;
        //n = nums2.length;
        int i=0,j=0;
        int idx = 0;
        while(i<m && j < n){
            if(nums1[i] <= nums2[j]){
                res[idx] = nums1[i];
                idx ++;
                i++;
            }
            else if(nums1[i] > nums2[j]){
                res[idx] = nums2[j];
                idx ++;
                j++;
            }
        }
        if(i==m && j < n){
            while(j<n){
                res[idx] = nums2[j];
                idx ++;
                j++;
            }
        }
        else if(j == n && i < m){
            while(i<m){
                res[idx] = nums1[i];
                idx++;
                i++;
            }
        }
        for(int k=0;k<idx;k++){
            nums1[k] = res[k];
        }
    }
}
