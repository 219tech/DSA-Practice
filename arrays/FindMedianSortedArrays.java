class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        
        int i=0, j=0, k=0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            }
            else{
                merged[k++] = nums2[j++];
            }
        }
        
        if(i == nums1.length){
            while(j < nums2.length){
                merged[k++] = nums2[j++];
            }
        }
        else{
            while(i < nums1.length){
                merged[k++] = nums1[i++];
            }
        }
        
        int mid = merged.length / 2;
        if(merged.length % 2 == 0){
            double n1 = merged[mid - 1];
            double n2 = merged[mid];
            return (n1 + n2) / 2;
        }
        else{
            return merged[mid];
        }
    }
}
