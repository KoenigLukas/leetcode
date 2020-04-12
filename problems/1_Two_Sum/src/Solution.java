import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15},9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if((nums[i]+nums[j]) == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
