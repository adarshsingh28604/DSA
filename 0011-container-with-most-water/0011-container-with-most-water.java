class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;

        while (left < right) {
            ans = Math.max(ans,
                    Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]) {
                int curr = height[left];
                while (left < right && height[left] <= curr)
                    left++;
            } else {
                int curr = height[right];
                while (left < right && height[right] <= curr)
                    right--;
            }
        }

        return ans;
    }
}