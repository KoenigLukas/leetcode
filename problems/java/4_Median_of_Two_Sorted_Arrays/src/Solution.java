public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = mergeArrays(nums1, nums2);
        int mlen = merge.length;
        double ret = 0;
        if (mlen % 2 == 0) ret = (double) (merge[mlen / 2] + merge[mlen / 2 - 1]) / 2;
        else ret = (double) merge[mlen / 2];

        return ret;

    }

    public int[] mergeArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] merge = new int[len1 + len2];

        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j])
                merge[k++] = nums1[i++];
            else
                merge[k++] = nums2[j++];
        }

        while (i < len1)
            merge[k++] = nums1[i++];

        while (j < len2)
            merge[k++] = nums2[j++];

        return merge;
    }
}
