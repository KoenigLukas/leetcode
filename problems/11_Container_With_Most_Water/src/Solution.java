public class Solution {

    public int maxArea(int[] height) {
        int a = 0, b = 0;
        int vol = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = height.length-1; j > i ; j--) {
                if(height[i] > height[j]) if(height[j]*(j-i) > vol) vol = height[j]*(j-i);
                if(height[i] <= height[j]) if(height[i]*(j-i) > vol) vol = height[i]*(j-i);
            }
        }

        return vol;
    }

}
