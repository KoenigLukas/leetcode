public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int sum = nums[0];
        int[] ret = new int[len];
        for (int i = 1; i < len; i++) {
            sum *= nums[i];
        }
        for (int i = 0; i < len; i++) {
            ret[i] = sum/nums[i];
        }
        return ret;
    }

}
