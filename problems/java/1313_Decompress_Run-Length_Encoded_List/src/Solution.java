public class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i <= nums.length; i+=2) {
            len += nums[i];
        }
        int[] ret = new int[len];
        int in = 0;
        for (int i = 1; i <= nums.length-1; i+=2) {
            for (int j = 0; j < nums[(i-1)]; j++) {
                ret[in] = nums[i];
                in++;
            }
        }
        return ret;
    }
}
